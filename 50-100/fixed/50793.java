@java.lang.Override
public de.fau.cs.mad.kwikshop.server.dao.Item addListItem(de.fau.cs.mad.kwikshop.server.dao.User user, int listId, de.fau.cs.mad.kwikshop.server.dao.Item item) throws de.fau.cs.mad.kwikshop.server.exceptions.ListNotFoundException {
    TList list = getListById(user, listId);
    item.setVersion(1);
    de.fau.cs.mad.kwikshop.server.dao.AbstractListDAO.currentSession().persist(item);
    list.addItem(item);
    list.setVersion(((list.getVersion()) + 1));
    de.fau.cs.mad.kwikshop.server.dao.AbstractListDAO.persist(list);
    return item;
}