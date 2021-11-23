@java.lang.Override
public java.util.List<T> getListByHQL(java.lang.String hqlString, java.lang.Object... values) {
    org.hibernate.Query query = this.getSession().createQuery(hqlString);
    if (values != null) {
        for (int i = 0; i < (values.length); i++) {
            query.setParameter(i, values[i]);
        }
    }
    return query.list();
}