void setComment(java.util.List<com.electronwill.nightconfig.core.io.CharsWrapper> commentsList) {
    com.electronwill.nightconfig.core.io.CharsWrapper.Builder builder = new com.electronwill.nightconfig.core.io.CharsWrapper.Builder(32);
    if (!(commentsList.isEmpty())) {
        java.util.Iterator<com.electronwill.nightconfig.core.io.CharsWrapper> it = commentsList.iterator();
        builder.append(it.next());
        while (it.hasNext()) {
            builder.append('\n');
            builder.append(it.next());
        } 
    }
    currentComment = builder.toString();
}