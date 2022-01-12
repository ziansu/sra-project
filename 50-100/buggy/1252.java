public void onSoundDownloaded(java.io.File soundFile) {
    this.soundLocation = soundFile;
    java.lang.String path = soundLocation.getAbsolutePath();
    path = path.substring(0, path.lastIndexOf(java.io.File.separator));
    path = path.substring(((path.lastIndexOf(java.io.File.separator)) + 1));
    if (path.equals("sounds"))
        path = "";
    
    this.category = path;
    this.state = com.zoonie.custominteractionsounds.sound.Sound.SoundState.SYNCED;
}