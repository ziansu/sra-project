private static soot.JastAddJ.PathPart createPathPart(java.lang.String s) {
    try {
        java.io.File f = new java.io.File(s);
        if (f.isDirectory())
            return new soot.JastAddJ.FolderPart(f);
        else
            if (f.isFile())
                return new soot.JastAddJ.ZipFilePart(f);
            
        
    } catch (java.io.IOException e) {
    }
    return null;
}