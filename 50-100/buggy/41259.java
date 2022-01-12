public iFace.User getUserById(int id) {
    iFace.User u = null;
    if ((m_users.size()) > 0) {
        for (int i = 0; i < (m_users.size()); i++) {
            if ((m_users.get(i).setId(id)) == id) {
                u = m_users.get(i);
                break;
            }
        }
    }
    return u;
}