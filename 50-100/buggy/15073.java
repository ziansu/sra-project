private static void removeCache(java.lang.String id) {
    com.sciamlab.auth.model.User user = com.sciamlab.auth.dao.SciamlabLocalUserDAO.USERS_BY_ID.remove(id);
    if (user != null) {
        com.sciamlab.auth.dao.SciamlabLocalUserDAO.USERS_BY_API_KEY.remove(user.getApiKey());
        java.util.Map<java.lang.String, com.sciamlab.auth.model.User> map = com.sciamlab.auth.dao.SciamlabLocalUserDAO.USERS_BY_TYPE.get(user.getType());
        if (map != null)
            map.remove(user.getUserName());
        
    }
}