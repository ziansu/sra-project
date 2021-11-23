public boolean disconnect(java.lang.String user) {
    if (!(users.containsKey(user))) {
        return false;
    }
    fr.upem.user.User u = users.get(user);
    if (!(u.isConnected())) {
        return false;
    }else {
        u.setConnected(false);
        return true;
    }
}