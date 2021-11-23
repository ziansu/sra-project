@java.lang.Override
public boolean removeAllForUserId(java.lang.Long id) {
    eventDAO.removeForUser(id);
    infoElemDAO.removeForUser(id);
    profileDAO.removeForUser(id);
    userDAO.remove(id);
    return true;
}