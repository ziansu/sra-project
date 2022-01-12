private void addToHistory(com.github.stephenbaidu.placepicker.PlaceInfo placeInfo) {
    int newIndex = (getHistoryRecords().size()) + 1;
    if (newIndex > (HISTORY_SIZE)) {
        for (int i = 0; i < (HISTORY_SIZE); ++i) {
            putHistoryRecord(getHistoryRecord((i + 2)), (i + 1));
        }
        newIndex = HISTORY_SIZE;
    }
    putHistoryRecord(placeInfo, newIndex);
}