public com.netcracker.entity.Driver getDriver(java.lang.String email) {
    com.netcracker.dao.DriverDAO drDao = new com.netcracker.dao.DriverDAO();
    com.netcracker.entity.Driver driver = null;
    try {
        driver = drDao.findByEmail(email);
    } catch (javax.persistence.NoResultException e) {
        e.printStackTrace();
    }
    drDao.close();
    return driver;
}