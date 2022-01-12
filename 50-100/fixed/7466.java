public static java.io.File findExe(java.io.File root, java.lang.String exe, boolean fail) {
    for (java.io.File file : org.apache.commons.io.FileUtils.listFiles(root, null, true))
        if ((file.getName().equalsIgnoreCase(exe)) && ((file.length()) >= 1))
            return file;
        
    
    if (!fail)
        return null;
    
    throw new java.lang.UnsupportedOperationException((("Couldn't find '" + exe) + "'!"));
}