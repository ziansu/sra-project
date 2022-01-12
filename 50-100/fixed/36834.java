public com.sciamlab.auth.model.User reactivateUser(final java.lang.String id, final java.lang.String type) {
    this.execUpdate(AuthLibConfig.UPDATE_USER, new java.util.ArrayList<java.lang.Object>() {
        {
            add(new java.sql.Timestamp(new java.util.Date().getTime()));
            add(id);
        }
    });
    com.sciamlab.auth.model.User user = this.getUserById(id);
    return com.sciamlab.auth.dao.SciamlabLocalUserDAO.updateCache(user);
}