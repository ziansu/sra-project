public int[] FindOutStream(int streamIndex) {
    for (int i = 0; i < (Coders.size()); i++) {
        int curSize = ((SevenZip.Archive.Common.CoderStreamsInfo) (Coders.get(i))).NumOutStreams;
        if (streamIndex < curSize)
            return new int[]{ i , streamIndex };
        
        streamIndex -= curSize;
    }
    return null;
}