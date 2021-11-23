public org.json.JSONObject toJson() throws org.json.JSONException {
    org.json.JSONObject res = new org.json.JSONObject();
    res.put(org.georchestra.ldapadmin.dto.OrgExt.JSON_ID, this.getId());
    if ((this.getOrgType()) != null)
        res.put(org.georchestra.ldapadmin.dto.OrgExt.JSON_ORG_TYPE, this.getOrgType());
    
    if ((this.getAddress()) != null)
        res.put(org.georchestra.ldapadmin.dto.OrgExt.JSON_ADDRESS, this.getAddress());
    
    return res;
}