@java.lang.Override
public com.epam.store.bean.Response getEquipmentList() throws com.epam.store.service.exception.ServiceException {
    com.epam.store.bean.Response response = null;
    com.epam.store.DAO.factory.DAOFactory daoFactory = com.epam.store.DAO.factory.DAOFactory.getInstance();
    com.epam.store.DAO.StoreDAO storeDAO = daoFactory.getStoreDAO();
    try {
        response = storeDAO.getEquipmentList();
    } catch (com.epam.store.DAO.exception.DAOException e) {
        throw new com.epam.store.service.exception.ServiceException("Equipment list can not be returned", e);
    }
    return response;
}