@java.lang.Override
public boolean isUserAssignedLicenseStillValid(java.lang.String user, java.lang.String licenseId) {
    java.lang.String hql = "select validUntil from LicenseManagementEntry " + "where licenseID = ?";
    java.lang.Object[] params = new java.lang.Object[]{ licenseId };
    java.util.List hqlResult = licenseManagementDao.findByQuery(hql, params);
    if ((hqlResult.size()) != 1) {
        return false;
    }else {
        return (java.lang.Long.parseLong(((java.lang.String) (hqlResult.get(0))))) > (java.lang.System.currentTimeMillis());
    }
}