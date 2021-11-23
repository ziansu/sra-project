public void updateUser(cn.newtouch.dms.entity.User user) {
    if (org.apache.commons.lang3.StringUtils.isNotBlank(user.getPlainPassword())) {
        entryptPassword(user);
    }
    userDao.save(user);
}