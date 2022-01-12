@java.lang.Override
protected boolean doPollDirectory(java.lang.String absolutePath, java.lang.String dirName, java.util.List<org.apache.camel.component.file.GenericFile<java.lang.Object>> genericFiles, int depth) {
    if ("IllegalStateException".equals(doPollResult)) {
        throw new java.lang.IllegalStateException("Problem");
    }else
        if ("GenericFileOperationFailedException".equals(doPollResult)) {
            throw new org.apache.camel.component.file.GenericFileOperationFailedException("Perm error");
        }else
            if ("true".equals(doPollResult)) {
                return true;
            }else {
                return false;
            }
        
    
}