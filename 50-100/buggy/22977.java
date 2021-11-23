public java.io.InputStream getInputStream(java.lang.String name) {
    initPaths();
    try {
        for (java.util.Iterator iter = classPath.iterator(); iter.hasNext();) {
            soot.JastAddJ.PathPart part = ((soot.JastAddJ.PathPart) (iter.next()));
            if (part.selectCompilationUnit(name))
                return part.is;
            
        }
    } catch (java.io.IOException e) {
    }
    throw new java.lang.Error(("Could not find nested type " + name));
}