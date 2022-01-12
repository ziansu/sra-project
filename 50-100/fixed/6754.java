private long getVideoLengthInSeconds(java.lang.String pFileName) {
    try {
        com.coremedia.iso.IsoFile lIsoFile = new com.coremedia.iso.IsoFile(new com.coremedia.iso.IsoBufferWrapperImpl(new java.io.File(pFileName)));
        lIsoFile.parse();
        return (lIsoFile.getMovieBox().getMovieHeaderBox().getDuration()) / (lIsoFile.getMovieBox().getMovieHeaderBox().getTimescale());
    } catch (java.io.IOException e) {
        android.util.Log.e("streamletService-getVideoLengthInSeconds", e.getMessage());
    }
    return 0;
}