private boolean userExists(java.lang.String name) {
    for (User user : clientList.keySet())
        if (name.equals(user.getName()))
            return true;
        
    
    return false;
}