@java.lang.Override
public <BEAN> com.jporm.query.delete.Delete<java.util.List<BEAN>> delete(java.util.Collection<BEAN> beans) throws com.jporm.exception.OrmException {
    return add(session.delete(beans));
}