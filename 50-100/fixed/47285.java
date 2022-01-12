protected java.io.File checkProjectFile(java.io.File f) throws ui.ValidationException {
    if (f.isDirectory())
        throw new ui.ValidationException("Choosen file is a directory! Nothing saved.");
    
    if (!(f.getName().endsWith(".xml")))
        f = new java.io.File(((f.getAbsolutePath()) + ".xml"));
    
    if (f.exists())
        if (!(overwrite(f)))
            throw new ui.ValidationException(((f.getName()) + " NOT overwritten. Nothing saved."));
        
    
    return f;
}