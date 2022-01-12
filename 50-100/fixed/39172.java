public java.util.LinkedList<java.lang.String> getNonAlgoSessionIDs(java.lang.String username) {
    if (users.containsKey(username)) {
        return users.get(username).getNonAlgoSessionIds();
    }else {
        java.lang.System.out.println((username + " does not exist"));
        return new java.util.LinkedList<java.lang.String>();
    }
}