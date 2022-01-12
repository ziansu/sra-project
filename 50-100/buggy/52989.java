@java.lang.Override
public java.util.List<org.jtalks.common.model.entity.Group> getMatchedByName(java.lang.String name) {
    if (name == null) {
        return getAll();
    }
    org.hibernate.Query query = getSession().createQuery("from Group g where g.name like ?");
    query.setString(0, (("%" + name) + "%"));
    @java.lang.SuppressWarnings(value = "unchecked")
    java.util.List<org.jtalks.common.model.entity.Group> list = query.list();
    return list;
}