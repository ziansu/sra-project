@java.lang.Override
public cn.edu.nju.software.entity.User addOrUpdateUser(cn.edu.nju.software.entity.User user) {
    if (((user.getId()) != 0) && ((user.getId()) != null)) {
        boolean up = userDao.updateUser(user);
        return up ? user : null;
    }
    boolean res = userDao.saveUser(user);
    if (res) {
        user.setId(userDao.getNewestId());
        return user;
    }
    return null;
}