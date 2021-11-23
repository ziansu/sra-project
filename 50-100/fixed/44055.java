private static java.lang.String nextDef(java.io.BufferedReader reader) throws java.io.IOException {
    java.lang.String line = com.subcherry.merge.MappingLoader.nextLine(reader);
    if (line == null) {
        return null;
    }
    while (line.endsWith("\\")) {
        java.lang.String fragment = com.subcherry.merge.MappingLoader.nextLine(reader);
        if (fragment == null) {
            break;
        }
        line = (line.substring(0, ((line.length()) - 1))) + fragment;
    } 
    return line;
}