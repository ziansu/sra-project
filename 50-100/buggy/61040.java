public static java.util.concurrent.atomic.AtomicStampedReference ClearMark(java.util.concurrent.atomic.AtomicStampedReference asr, int mark) {
    if (asr != null) {
        java.util.concurrent.atomic.AtomicStampedReference asrClone = LockFreeDataStructures.ReferenceUtilities.CloneAsr(asr);
        int[] stampHolder = new int[]{ 0 };
        java.lang.Object pointer = asr.get(stampHolder);
        stampHolder[0] = (stampHolder[0]) & (~mark);
        asrClone.attemptStamp(pointer, stampHolder[0]);
        return asr;
    }
    throw new java.lang.NullPointerException(LockFreeDataStructures.ReferenceUtilities.NULL_ERROR_MESSAGE);
}