public com.vn.dailycookapp.cache.user.CompactUserInfo getInfoByEmail(java.lang.String email) throws org.dao.DAOException {
    java.lang.String id = emailMap.get(email);
    if (id == null) {
        org.entity.User user = org.dao.UserDAO.getInstance().getUserInfoByEmail(email);
        if ((user != null) && (user.getRole().equals(User.NORMAL_USER_ROLE))) {
            id = user.getId();
        }
    }
    return id == null ? null : userMap.get(id);
}