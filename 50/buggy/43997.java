public org.edx.mobile.model.api.PathModel getChapter() {
    if (path[0].isChapter())
        return path[0];
    
    if (path[1].isChapter())
        return path[1];
    
    return null;
}