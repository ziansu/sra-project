@java.lang.Override
public ua.nc.entity.profile.StudentData getStudents(java.lang.Integer itemPerPage, java.lang.Integer pageNumber, java.lang.Integer orderBy) {
    java.sql.Connection connection = daoFactory.getConnection();
    ua.nc.dao.postgresql.PostgreApplicationTableDAO applicationTableDAO = new ua.nc.dao.postgresql.PostgreApplicationTableDAO(connection);
    ua.nc.service.CESServiceImpl cesService = new ua.nc.service.CESServiceImpl();
    ua.nc.entity.CES ces = cesService.getCurrentCES();
    try {
        return applicationTableDAO.getApplicationsTable(ces.getId(), itemPerPage, pageNumber);
    } catch (ua.nc.dao.exception.DAOException e) {
        ua.nc.service.StudentServiceImpl.log.warn("Can't get students", e.getCause());
    }
    return null;
}