public boolean addUser(iFace.User u) {
    if ((getUserById(u.getId())) != null)
        return false;
    
    return m_users.add(u);
}