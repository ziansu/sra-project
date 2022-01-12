public boolean isClipObjectStarred(java.lang.String string) {
    java.util.List<com.catchingnow.tinyclipboardmanager.ClipObject> allClips = getClipHistory();
    for (com.catchingnow.tinyclipboardmanager.ClipObject clipObject : allClips) {
        if (clipObject.getText().equals(string)) {
            return clipObject.isStarred();
        }
    }
    return false;
}