private boolean isOnline(int ID) {
    if ((clientIDs.get(ID)) == null)
        return false;
    
    return (getClient(clientIDs.get(ID))) != null;
}