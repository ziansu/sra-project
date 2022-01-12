@java.lang.SuppressWarnings(value = "unchecked")
private org.json.simple.JSONObject constructPrimaryDataJsonById(org.gfbio.model.PrimaryData primaryData) throws com.liferay.portal.NoSuchUserException, com.liferay.portal.kernel.exception.SystemException {
    org.json.simple.JSONObject json = new org.json.simple.JSONObject();
    json.put("primarydataid", primaryData.getPrimaryDataID());
    json.put("name", primaryData.getName().trim());
    json.put("path", primaryData.getPath().trim());
    json.put("lastmodifieddate", primaryData.getLastModifiedDate());
    return json;
}