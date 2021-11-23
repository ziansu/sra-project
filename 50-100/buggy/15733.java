private static java.lang.String matchOptionsForUpdate(java.lang.String postfix, int index, java.util.ArrayList<metaData.ManualMetaData> metaData, java.util.ArrayList<java.lang.String> names, java.util.ArrayList<java.lang.Integer> ids) {
    for (metaData.ManualMetaData datum : metaData) {
        if (names.get(index).equals(datum.getName())) {
            postfix = metaData.ManualMetaData.matchOptionsToIds(postfix, ids.get(index), datum.getOptions());
            break;
        }
    }
    return postfix;
}