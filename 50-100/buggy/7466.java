public static java.io.File findExe(java.io.File root, java.lang.String exe) {
    for (java.io.File file : org.apache.commons.io.FileUtils.listFiles(root, null, true))
        if ((file.getName().equalsIgnoreCase(exe)) && ((file.length()) >= 1))
            return file;
        
    
    throw new java.lang.UnsupportedOperationException((("Couldn't find '" + exe) + "'!"));
}