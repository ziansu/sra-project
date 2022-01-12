@java.lang.Override
public ru.nemchinovsergey.javarush.model.User getUserById(int id) {
    ru.nemchinovsergey.javarush.dao.UserDaoImpl.logger.debug("getUserById() id : {}", id);
    ru.nemchinovsergey.javarush.dao.Session session = sessionFactory.getCurrentSession();
    ru.nemchinovsergey.javarush.model.User user = ((ru.nemchinovsergey.javarush.model.User) (session.get(ru.nemchinovsergey.javarush.model.User.class, id)));
    ru.nemchinovsergey.javarush.dao.UserDaoImpl.logger.info("User successfully loaded. User details: {}", user);
    return user;
}