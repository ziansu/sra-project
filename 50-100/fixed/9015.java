public static java.lang.String readStringFromFile(java.io.File inputFile) {
    if (edu.iastate.symex.util.FileIO.TURN_CACHE_ON) {
        if (!(edu.iastate.symex.util.FileIO.fileMap.containsKey(inputFile)))
            edu.iastate.symex.util.FileIO.fileMap.put(inputFile, edu.iastate.symex.util.FileIO.readStringFromFileWithoutCache(inputFile));
        
        return edu.iastate.symex.util.FileIO.fileMap.get(inputFile);
    }else {
        return edu.iastate.symex.util.FileIO.readStringFromFileWithoutCache(inputFile);
    }
}