public long getTime(java.lang.String argumentName, long defaultValue) {
    if (!(nameToIndex.containsKey(argumentName.toLowerCase()))) {
        return null;
    }
    return getTime(nameToIndex.get(argumentName.toLowerCase()), defaultValue);
}