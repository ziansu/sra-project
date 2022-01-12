private void obtainObjectReferences() {
    if ((rawTextPanel) == null) {
        rawTextPanel = getMainFrame().getRawTextPanel();
        imagePanel = getMainFrame().getImagePanel();
        jnPanel = getMainFrame().getJNPanel();
        statefulObjects.put(com.sandy.jnmaker.ui.helper.ProjectManager.KEY_JOVENOTESPANEL, jnPanel);
        statefulObjects.put(com.sandy.jnmaker.ui.helper.ProjectManager.KEY_RAWTEXTPANEL, rawTextPanel);
        statefulObjects.put(com.sandy.jnmaker.ui.helper.ProjectManager.KEY_IMAGEPANEL, imagePanel);
    }
}