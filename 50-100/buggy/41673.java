public void uploadSound() {
    java.io.File currentDirectory = null;
    try {
        currentDirectory = new java.io.File(new java.io.File(".").getCanonicalPath());
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    java.lang.String location = (((currentDirectory + "\\downloads\\") + (dalnId)) + "\\") + (fileName);
    de.voidplus.soundcloud.Track newTrack = new de.voidplus.soundcloud.Track(assetID, location);
    newTrack.setDescription(fullDescription);
    track = soundcloud.postTrack(newTrack);
}