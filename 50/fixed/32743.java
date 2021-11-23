public void addFollowing(java.lang.String uidFollowing, java.lang.String uidFollower) {
    fr.epsi.tp.ws.dao.UserDao userDao = new fr.epsi.tp.ws.dao.impl.UserDaoImpl();
    userDao.addFollowingById(uidFollowing, uidFollower);
}