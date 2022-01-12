public static boolean writeAutorunFile(javax.swing.JFrame caller) throws java.lang.Exception {
    wheeler.generic.structs.StringList contents = new wheeler.generic.structs.StringList((("java -jar " + (wheeler.generic.data.StringHandler.addQuotes(filesearcher.data.FileHandler.getJarLocation(caller)))) + " seeker")).add("exit");
    if ((fileExists(filesearcher.data.FileHandler.autorunFile())) && (readFile(filesearcher.data.FileHandler.autorunFile(), true, true).equals(contents)))
        return false;
    
    writeFile(contents, true, filesearcher.data.FileHandler.autorunFile());
    return true;
}