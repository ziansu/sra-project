@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public ar.edu.unq.desapp.grupoC.model.user.User findById(final java.io.Serializable id) {
    ar.edu.unq.desapp.grupoC.model.user.User user = this.getHibernateTemplate().get(this.persistentClass, id);
    user.addRoles();
    return user;
}