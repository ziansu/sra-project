public byte[] get(java.lang.String key, boolean renew) {
    net.vicp.lylab.core.model.CacheValue cv = getContainer().get(key);
    if (cv == null)
        return null;
    
    if ((cv.getValidateTime()) < ((java.lang.System.currentTimeMillis()) - (cv.getStartTime()))) {
        remove(key, cv);
        return null;
    }
    if (renew)
        cv.renewStartTime();
    
    return cv.getValue();
}