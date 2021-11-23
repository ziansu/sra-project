public java.lang.String tagsString() {
    if ((tags.length) == 0) {
        return "";
    }
    java.lang.String returnValue = "";
    for (int i = 0; i < ((tags.length) - 1); i++) {
        returnValue += (tags[i]) + ",";
    }
    returnValue += tags[((tags.length) - 1)];
    return returnValue;
}