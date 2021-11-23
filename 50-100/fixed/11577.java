@java.lang.Override
public com.jomm.terroir.business.model.AbstractUser update(com.jomm.terroir.business.model.AbstractUser user) throws com.jomm.terroir.util.InvalidEntityException, java.lang.NullPointerException {
    if (user == null) {
        throw new java.lang.NullPointerException();
    }else
        if ((user.getId()) == null) {
            throw new com.jomm.terroir.util.InvalidEntityException();
        }
    
    return userDao.update(user);
}