@java.lang.Override
public void removeUser(int id) {
    ru.nemchinovsergey.javarush.dao.UserDaoImpl.logger.debug("removeUser() id : {}", id);
    ru.nemchinovsergey.javarush.dao.Session session = sessionFactory.getCurrentSession();
    ru.nemchinovsergey.javarush.model.User user = ((ru.nemchinovsergey.javarush.model.User) (session.load(ru.nemchinovsergey.javarush.model.User.class, id)));
    if (user != null) {
        session.delete(user);
    }
    ru.nemchinovsergey.javarush.dao.UserDaoImpl.logger.info("User successfully removed. User details: {}", user);
}