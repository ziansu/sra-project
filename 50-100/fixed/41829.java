private org.json.JSONObject encodeToJson(org.georchestra.ldapadmin.dto.Org org, org.georchestra.ldapadmin.dto.OrgExt orgExt) throws org.json.JSONException {
    org.json.JSONObject res = org.toJson();
    if ((orgExt.getOrgType()) != null)
        res.put("orgType", orgExt.getOrgType());
    
    if ((orgExt.getAddress()) != null)
        res.put("address", orgExt.getAddress());
    
    return res;
}