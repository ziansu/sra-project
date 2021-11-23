@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public void lockDocument(java.lang.String clientID, java.lang.String documentKey) {
    java.util.Map<java.lang.String, java.lang.String> tokenMap = ((java.util.Map<java.lang.String, java.lang.String>) (getThreadLocalRequest().getAttribute(edu.caltech.cs141b.hw2.gwt.collab.server.CollaboratorServiceImpl.TOKEN_MAP)));
    if (!(tokenMap.containsKey(documentKey))) {
        tokenMap.put(documentKey, "server");
    }
    if (tokenMap.get(documentKey).equals("server")) {
        sendToken(clientID, documentKey);
    }else {
        addToDocQueue(clientID, documentKey);
    }
}