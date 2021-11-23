private int lastDuplicateIndex(java.util.List<com.google.gson.JsonObject> orderedLogs) {
    int lastDuplicateIndex = -1;
    if (!(orderFieldNames.isEmpty())) {
        for (int i = 0; i < (orderedLogs.size()); i++) {
            if (isDuplicateLog(orderedLogs.get(i))) {
                lastDuplicateIndex = i;
            }
        }
    }
    return lastDuplicateIndex;
}