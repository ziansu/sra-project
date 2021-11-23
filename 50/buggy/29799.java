public java.lang.String treatAsCallOutToDestination(org.mule.api.processor.MessageProcessor mp) {
    if (mp == null)
        return null;
    
    if (mp instanceof org.mule.module.db.internal.processor.AbstractDbMessageProcessor)
        return "JDBC Database";
    
    if (mp instanceof org.mule.module.http.internal.request.DefaultHttpRequester)
        return ((org.mule.module.http.internal.request.DefaultHttpRequester) (mp)).getHost();
    
    return null;
}