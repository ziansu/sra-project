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
    if ((title) != null) {
        java.lang.System.out.println(((title) + " is null"));
    }
    java.lang.System.out.println("now validating data");
    validateData();
    java.lang.System.out.println(((title) + " after validating data"));
}