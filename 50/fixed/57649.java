private static java.util.ArrayList<java.lang.String> getSeparateFields(java.lang.String fileLineContent) {
    java.util.ArrayList<java.lang.String> separatedContents = new java.util.ArrayList<java.lang.String>(java.util.Arrays.asList(fileLineContent.split(Storage.TAGS_LINE_FIELD_SEPARATOR)));
    return separatedContents;
}