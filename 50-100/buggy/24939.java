private boolean isString(java.lang.String value) {
    int firstIndex = value.indexOf('"');
    int lastIndex = value.lastIndexOf('"');
    if ((firstIndex == (-1)) || (firstIndex == lastIndex)) {
        return false;
    }else {
        value = value.substring(firstIndex, lastIndex);
        return !(value.contains("\""));
    }
}