@java.lang.Override
public TList createList(de.fau.cs.mad.kwikshop.server.dao.User user, TList list) {
    list.setOwnerId(user.getId());
    list.setVersion(1);
    return de.fau.cs.mad.kwikshop.server.dao.AbstractListDAO.persist(list);
}