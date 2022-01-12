public long extractIdFromFilename(java.lang.String filename) throws com.dbdeploy.exceptions.UnrecognisedFilenameException {
    java.util.regex.Matcher matches = pattern.matcher(filename);
    if ((!(matches.matches())) || ((matches.groupCount()) != 1))
        throw new com.dbdeploy.exceptions.UnrecognisedFilenameException(("Could not extract a change script number from filename: " + filename));
    
    return java.lang.Long.parseLong(matches.group(1));
}