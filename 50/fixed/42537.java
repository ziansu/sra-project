@java.lang.Override
public boolean removeById(int id) {
    return (em.createNamedQuery(User.DELETE_USER).setParameter("id", id).executeUpdate()) != 0;
}