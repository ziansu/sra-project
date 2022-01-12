@java.lang.Override
public arhangel.dim.core.Chat getByPk(java.lang.Long key) throws arhangel.dim.core.store.dao.PersistException {
    arhangel.dim.core.Chat chat = super.getByPk(key);
    if (chat == null) {
        return null;
    }
    arhangel.dim.core.store.dao.GenericDao<arhangel.dim.core.User, java.lang.Long> userDao = daoFactory.getDao(arhangel.dim.core.User.class);
    chat.setParticipants(getParticipantsOfChatWithId(chat.getId()));
    return chat;
}