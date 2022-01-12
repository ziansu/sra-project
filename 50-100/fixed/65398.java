@java.lang.Override
public org.moqui.impl.entity.EntityValue previous() {
    try {
        if (rs.previous()) {
            org.moqui.impl.entity.EntityValueBase evb = ((org.moqui.impl.entity.EntityValueBase) (currentEntityValue()));
            if ((txCache) != null) {
                org.moqui.impl.entity.EntityJavaUtil.WriteMode writeMode = txCache.checkUpdateValue(evb);
                if (writeMode == (EntityJavaUtil.WriteMode.DELETE))
                    return this.previous();
                
            }
            return evb;
        }else {
            return null;
        }
    } catch (java.sql.SQLException e) {
        throw new org.moqui.impl.entity.EntityException("Error getting previous result", e);
    }
}