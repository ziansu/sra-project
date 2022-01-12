private void checkAppFirstStart() {
    if ((settingsManager) == null) {
        settingsManager = com.fesskiev.player.utils.AppSettingsManager.getInstance(getApplication());
    }
    if (settingsManager.isFirstStartApp()) {
        settingsManager.setFirstStartApp();
        saveDownloadFolderIcon();
        addAudioFragment(true);
    }else {
        addAudioFragment(false);
    }
}