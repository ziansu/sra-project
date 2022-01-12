private static boolean isSuitable(java.lang.String[] optionValues, java.util.HashMap tagsMap) {
    for (int i = 0; i < ((optionValues.length) - 1); i += 2) {
        if ((tagsMap.containsKey(optionValues[i])) && (!(java.util.Objects.equals(tagsMap.get(optionValues[i]), optionValues[(i + 1)])))) {
            return false;
        }
    }
    return true;
}