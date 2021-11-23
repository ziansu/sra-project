@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public void lockDocument(java.lang.String clientID, java.lang.String documentKey) {
    if (!(tokenMap.containsKey(documentKey))) {
        tokenMap.put(documentKey, "server");
    }
    if (tokenMap.get(documentKey).equals("server")) {
        sendToken(clientID, documentKey);
    }else {
        addToDocQueue(clientID, documentKey);
    }
}