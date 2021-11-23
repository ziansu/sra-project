public static final int fillDateTimePool(org.lionsoul.jcseg.tokenizer.core.IWord[] wPool, org.lionsoul.jcseg.tokenizer.core.IWord word) {
    int pIdx = org.lionsoul.jcseg.util.TimeUtil.getDateTimeIndex(word.getEntity(0));
    if (pIdx == (org.lionsoul.jcseg.util.TimeUtil.DATETIME_NONE)) {
        return org.lionsoul.jcseg.util.TimeUtil.DATETIME_NONE;
    }
    wPool[pIdx] = word;
    return pIdx;
}