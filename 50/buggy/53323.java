private void checkReadState() throws java.lang.IllegalStateException {
    if (!(iterationStarted))
        throw new java.lang.IllegalStateException("No row has yet been read!");
    else
        if (endReached)
            throw new java.lang.IllegalStateException("End of VOTable file already reached!");
        
    
}