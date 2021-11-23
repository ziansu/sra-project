private static int checkAdaptationSetTypeConsistency(int firstType, int secondType) {
    if (firstType == (AdaptationSet.TYPE_UNKNOWN)) {
        return secondType;
    }else
        if (secondType == (AdaptationSet.TYPE_UNKNOWN)) {
            return firstType;
        }else {
            com.google.android.exoplayer.util.Assertions.checkState((firstType == secondType));
            return firstType;
        }
    
}