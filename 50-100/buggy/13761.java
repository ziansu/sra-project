public void Code(java.util.Vector<java.io.InputStream> inStreams, int numInStreams, java.util.Vector<java.io.OutputStream> outStreams, int numOutStreams, SevenZip.ICompressProgressInfo progress) throws java.io.IOException {
    try {
        CodeReal(inStreams, numInStreams, outStreams, numOutStreams, progress);
    } catch (java.io.IOException e) {
        throw e;
    } finally {
        ReleaseStreams();
    }
}