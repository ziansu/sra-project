public com.brashmonkey.spriter.file.Reference findReferenceByFileName(java.lang.String fileName) {
    com.brashmonkey.spriter.file.Reference[] refs = this.getRefs();
    for (com.brashmonkey.spriter.file.Reference ref : refs)
        if (ref.fileName.toLowerCase().equals(fileName))
            return ref;
        
    
    return null;
}