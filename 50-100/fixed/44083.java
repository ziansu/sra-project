public com.sandy.jnmaker.lucene.ChapterInfo getChapterInfo() {
    com.sandy.jnmaker.lucene.ChapterInfo info = null;
    if ((currentFile) != null) {
        try {
            info = getIndexingDaemon().getChapterInfo(currentFile);
        } catch (java.lang.Exception e) {
            com.sandy.jnmaker.ui.panels.jn.JoveNotesPanel.logger.error("Could not get chapter info", e);
        }
    }
    return info;
}