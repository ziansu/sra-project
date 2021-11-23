private int getFirstStartPos(java.util.List<java.util.List<abra.SAMRecordWrapper>> readsList) {
    int minPos = java.lang.Integer.MAX_VALUE;
    for (java.util.List<abra.SAMRecordWrapper> reads : readsList) {
        if ((reads.get(0).getSamRecord().getAlignmentStart()) < minPos) {
            minPos = reads.get(0).getSamRecord().getAlignmentStart();
        }
    }
    return minPos;
}