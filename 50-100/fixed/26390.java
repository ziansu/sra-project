public java.util.List<com.catchingnow.tinyclipboardmanager.ClipObject> getClipHistory(java.lang.String queryString) {
    java.util.List<com.catchingnow.tinyclipboardmanager.ClipObject> allClips = getClipHistory();
    java.util.List<com.catchingnow.tinyclipboardmanager.ClipObject> queryClips = new java.util.ArrayList<>();
    if (("".equals(queryString)) || (queryString == null)) {
        return allClips;
    }
    for (com.catchingnow.tinyclipboardmanager.ClipObject clip : allClips) {
        if (clip.getText().contains(queryString)) {
            queryClips.add(clip);
        }
    }
    return queryClips;
}