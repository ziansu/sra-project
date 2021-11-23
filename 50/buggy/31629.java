public model.computer.Computer getFirst() throws model.dao.DAOException {
    try {
        int id = getFirstId();
        return getDetails(id);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        throw new model.dao.DAOException(e);
    }
}