@java.lang.Override
public void remove(int id) {
    getCurrentSession().delete(id);
}