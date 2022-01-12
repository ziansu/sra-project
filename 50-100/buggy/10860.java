public int findHistoryRecord(java.lang.String placeId) {
    for (int i = 0; i < (HISTORY_SIZE); ++i) {
        com.github.stephenbaidu.placepicker.PlaceInfo placeInfo = getHistoryRecord((i + 1));
        if (placeInfo == null)
            return 0;
        
        if ((placeInfo.placeId) == placeId) {
            return i + 1;
        }
    }
    return 0;
}