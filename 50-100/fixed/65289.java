public java.util.List<T> find(java.lang.String hql, java.util.List<?> param) {
    org.hibernate.Query q = this.getCurrentSession().createQuery(hql);
    if ((param != null) && ((param.size()) > 0)) {
        for (int i = 0; i < (param.size()); i++) {
            q.setParameter(i, param.get(i));
        }
    }
    return q.list();
}