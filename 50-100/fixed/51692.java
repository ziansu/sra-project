private java.lang.String getExecutionKey(com.mangopay.core.APIs.PayIn payIn) throws java.lang.Exception {
    if ((payIn.ExecutionDetails) == null)
        throw new java.lang.Exception("Execution is not defined or it is not object type");
    
    java.lang.String className = payIn.ExecutionDetails.getClass().getName().replace("com.mangopay.entities.subentities.PayInExecutionDetails", "");
    return className.toLowerCase();
}