private java.lang.String getRuntimeTypeId(int selection) {
    if ((selection >= 0) && (selection < (runtimeIndexToIdsMap.length))) {
        return runtimeIndexToIdsMap[selection];
    }
    return null;
}