public java.util.LinkedList<java.util.HashMap<java.lang.String, java.lang.String>> addAlgoToUser(java.lang.String username, java.lang.String sessionID, long algoID) {
    if (sessionIds_to_name.containsKey(sessionID)) {
        return null;
    }
    if (!(users.containsKey(username))) {
        users.put(username, new Simulator.User(sessionID));
    }else {
        users.get(username).addAlgoSessionId(sessionID, algoID);
    }
    return addUser(sessionID, username);
}