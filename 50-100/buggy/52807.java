public void removeName(java.lang.String name) {
    for (int i = 0; i < (content.size()); i++) {
        if (content.get(i).equals(name)) {
            content.remove(i);
            notifyDataSetChanged();
            setNoContent(true);
            return ;
        }
    }
}