public long getTime(java.lang.String argumentName, long defaultValue) {
    if (!(nameToIndex.containsKey(argumentName.toLowerCase()))) {
        return 0;
    }
    return getTime(nameToIndex.get(argumentName.toLowerCase()), defaultValue);
}