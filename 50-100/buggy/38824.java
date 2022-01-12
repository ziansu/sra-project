@java.lang.Override
public org.moqui.impl.entity.EntityValue next() {
    try {
        if (rs.next()) {
            org.moqui.impl.entity.EntityValueBase evb = currentEntityValueBase();
            if ((txCache) != null) {
                org.moqui.impl.entity.EntityJavaUtil.WriteMode writeMode = txCache.checkUpdateValue(evb);
                if (writeMode.equals(EntityJavaUtil.WriteMode.DELETE))
                    return next();
                
            }
            return evb;
        }else {
            return null;
        }
    } catch (java.sql.SQLException e) {
        throw new org.moqui.impl.entity.EntityException("Error getting next result", e);
    }
}