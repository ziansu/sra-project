private boolean shouldContinue(java.util.List<org.zaproxy.zap.model.Context> contextList) {
    java.util.Iterator<org.zaproxy.zap.model.Context> contextIterator = contextList.iterator();
    boolean hasAuth = false;
    while (contextIterator.hasNext()) {
        if (contextIterator.next().getAuthenticationMethod().getType().getName().equals("Form-based Authentication")) {
            hasAuth = true;
        }
    } 
    return hasAuth;
}