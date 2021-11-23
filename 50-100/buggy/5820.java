@java.lang.Override
public java.lang.Long[] handle(java.util.Set<com.ctrip.zeus.service.model.IdVersion> result) throws java.lang.Exception {
    if (vsId != null) {
        boolean flag = false;
        for (com.ctrip.zeus.service.model.IdVersion e : result) {
            if (e.getId().equals(vsId)) {
                flag = true;
                break;
            }
        }
        if (!flag)
            return new java.lang.Long[0];
        
    }
    return com.ctrip.zeus.service.model.VersionUtils.extractUniqIds(result);
}