@java.lang.Override
public boolean exists(java.lang.String id) throws org.n52.series.db.da.DataAccessException {
    org.hibernate.Session session = getSession();
    try {
        if (org.n52.io.response.v1.ext.PlatformType.isStationaryId(id)) {
            org.n52.series.db.da.dao.v1.FeatureDao featureDao = new org.n52.series.db.da.dao.v1.FeatureDao(session);
            return featureDao.hasInstance(parseId(id), org.n52.series.db.da.beans.FeatureEntity.class);
        }else {
            org.n52.series.db.da.dao.v1.ext.PlatformDao dao = new org.n52.series.db.da.dao.v1.ext.PlatformDao(session);
            java.lang.String platformId = org.n52.io.response.v1.ext.PlatformType.extractId(id);
            return dao.hasInstance(parseId(platformId), org.n52.series.db.da.beans.ext.PlatformEntity.class);
        }
    } finally {
        returnSession(session);
    }
}