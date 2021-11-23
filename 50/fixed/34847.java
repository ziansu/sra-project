@java.lang.Override
public java.util.List<entity.Payment> findByUser(entity.User user) {
    java.util.Objects.requireNonNull(user);
    return defaultDao.findAll(((dao.impl.mysql.MySqlPaymentDao.SELECT_ALL) + (dao.impl.mysql.MySqlPaymentDao.WHERE_USER)), user.getId(), user.getId());
}