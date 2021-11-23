@java.lang.Override
public boolean removeById(int id) {
    return (em.createNamedQuery(User.DELETE_USER, model.User.class).setParameter("id", id).executeUpdate()) != 0;
}