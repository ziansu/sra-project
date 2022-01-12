@java.lang.Override
public void build(org.ums.fee.semesterfee.MutableInstallmentSettings pMutable, javax.json.JsonObject pJsonObject, org.ums.cache.LocalCache pLocalCache) {
    org.apache.commons.lang.Validate.notEmpty(pJsonObject);
    org.apache.commons.lang.Validate.notNull(pJsonObject.getInt("semesterId"));
    org.apache.commons.lang.Validate.notNull(pJsonObject.getBoolean("enabled"));
    pMutable.setSemesterId(pJsonObject.getInt("semesterId"));
    pMutable.setEnabled(pJsonObject.getBoolean("enabled"));
    if (pJsonObject.containsKey("id")) {
        pMutable.setId(java.lang.Long.parseLong(pJsonObject.getString("id")));
    }
}