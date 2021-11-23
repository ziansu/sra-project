public org.edx.mobile.model.api.PathModel getSection() {
    if (path[1].isSequential())
        return path[1];
    
    if (path[0].isSequential())
        return path[0];
    
    return null;
}