@java.lang.Override
public com.epam.project.model.Depo getDepoById(java.lang.Integer id) throws org.springframework.dao.DataAccessException {
    com.epam.project.serviceimpl.DepoServiceImpl.LOGGER.debug("getDepoById", id);
    org.springframework.util.Assert.notNull(id, "id nust not be null");
    com.epam.project.model.Depo depo;
    try {
        depo = depoDao.getDepoById(id);
    } catch (java.lang.Exception e) {
        com.epam.project.serviceimpl.DepoServiceImpl.LOGGER.debug("getDepoById have error", e);
        throw new java.lang.IllegalArgumentException();
    }
    return depo;
}