private java.lang.String getRuntimeTypeId(int selection) {
    if (selection != (-1)) {
        return runtimeIndexToIdsMap[selection];
    }
    return null;
}