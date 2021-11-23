public model.computer.Computer getFirst() throws model.dao.DAOException {
    int id = getFirstId();
    return getDetails(id);
}