public int iType2Index(int iType) {
    if ((iType2IndexMap[iType]) == (Jaybot.YOLOBOT.Util.Wissensdatenbank.YoloKnowledge.UNDEFINED)) {
        iType2IndexMap[iType] = currentITypeIndex;
        (currentITypeIndex)++;
    }
    return iType2IndexMap[iType];
}