@java.lang.Override
public java.lang.Integer addDepo(com.epam.project.model.Depo depo) throws org.springframework.dao.DataAccessException {
    com.epam.project.serviceimpl.DepoServiceImpl.LOGGER.debug("addDepo", depo);
    org.springframework.util.Assert.hasText(depo.getName(), "must have name");
    java.lang.Integer id;
    try {
        id = depoDao.addDepo(depo);
    } catch (java.lang.Exception e) {
        com.epam.project.serviceimpl.DepoServiceImpl.LOGGER.debug("addDepo have exception", e);
        throw new java.lang.IllegalArgumentException();
    }
    org.springframework.util.Assert.notNull(id);
    return id;
}