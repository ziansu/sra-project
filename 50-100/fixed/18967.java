private void getSongData() {
    initFileLocation();
    retriever = new android.media.MediaMetadataRetriever();
    try {
        retriever.setDataSource(context, location);
    } catch (java.lang.Exception e) {
    }
    try {
        retrieveData();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    validateData();
}