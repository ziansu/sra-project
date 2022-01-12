@java.lang.Override
public void changeUserAttribute(info.novatec.inspectit.communication.data.cmr.User userOld, java.lang.String email, java.lang.String password, long roleID, boolean passwordChanged) {
    if (passwordChanged) {
        info.novatec.inspectit.communication.data.cmr.User userNew = new info.novatec.inspectit.communication.data.cmr.User(userOld.getPassword(), email, roleID);
        userDao.delete(userOld);
        userDao.saveOrUpdate(userNew);
    }else {
        info.novatec.inspectit.communication.data.cmr.User userNew = new info.novatec.inspectit.communication.data.cmr.User(password, email, roleID);
        userDao.delete(userOld);
        addUser(userNew);
    }
}