public tr.com.ppm.desktop.dao.QueryHelper equalsIgnoreCase(java.lang.String key, java.lang.String value) {
    if (org.apache.commons.lang3.StringUtils.isNotBlank(value)) {
        queryString += ((" and lower(" + key) + ") = :") + key;
        params.put(key, value.toLowerCase());
    }
    return this;
}