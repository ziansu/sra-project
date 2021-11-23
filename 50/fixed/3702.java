@java.lang.Override
public boolean removeAllForUserId(java.lang.Long id) {
    profileDAO.removeForUser(id);
    eventDAO.removeForUser(id);
    infoElemDAO.removeForUser(id);
    userDAO.remove(id);
    return true;
}