public int FindInStream(int streamIndex) {
    for (int i = 0; i < (Coders.size()); i++) {
        int curSize = ((SevenZip.Archive.Common.CoderStreamsInfo) (Coders.get(i))).NumInStreams;
        if (streamIndex < curSize) {
            return i;
        }
        streamIndex -= curSize;
    }
    return -1;
}