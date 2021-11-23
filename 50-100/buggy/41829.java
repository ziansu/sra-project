private org.json.JSONObject encodeToJson(org.georchestra.ldapadmin.dto.Org org, org.georchestra.ldapadmin.dto.OrgExt orgExt) throws org.json.JSONException {
    org.json.JSONObject res = org.toJson();
    res.put("orgType", orgExt.getOrgType());
    res.put("address", orgExt.getAddress());
    return res;
}