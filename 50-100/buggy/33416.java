public boolean disconnect(java.lang.String user) throws java.lang.IllegalArgumentException {
    if (!(users.containsKey(user))) {
        throw new java.lang.IllegalArgumentException("This user doesn't exist");
    }
    fr.upem.user.User u = users.get(user);
    if (!(u.isConnected())) {
        throw new java.lang.IllegalArgumentException("This user is not connected");
    }else {
        u.setConnected(false);
        return true;
    }
}