private void obtainObjectReferences() {
    if ((rawTextPanel) == null) {
        rawTextPanel = com.sandy.jnmaker.util.ObjectRepository.getMainFrame().getRawTextPanel();
        imagePanel = com.sandy.jnmaker.util.ObjectRepository.getMainFrame().getImagePanel();
        jnPanel = com.sandy.jnmaker.util.ObjectRepository.getMainFrame().getJNPanel();
        statefulObjects.put(com.sandy.jnmaker.ui.helper.ProjectManager.KEY_JOVENOTESPANEL, jnPanel);
        statefulObjects.put(com.sandy.jnmaker.ui.helper.ProjectManager.KEY_RAWTEXTPANEL, rawTextPanel);
        statefulObjects.put(com.sandy.jnmaker.ui.helper.ProjectManager.KEY_IMAGEPANEL, imagePanel);
    }
}