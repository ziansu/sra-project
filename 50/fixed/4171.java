@java.lang.Override
public java.util.List<com.gans.vk.dao.UserDao.UserLibData> getRecomendedUserLibData(com.gans.vk.model.impl.User user, com.gans.vk.model.impl.User target) {
    return _userDao.getRecomendedUserLibData(user, target);
}