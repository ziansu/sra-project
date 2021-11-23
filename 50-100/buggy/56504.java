public void setProjectConfigFile(java.io.File file) throws java.lang.Exception {
    obtainObjectReferences();
    if (file.exists()) {
        if (closeProject()) {
            com.sandy.jnmaker.util.ObjectRepository.getWordRepository().clear();
            loadState(file);
            this.projectConfigFile = file;
            saveAppState();
            setMainFrameTitle();
        }
    }
}