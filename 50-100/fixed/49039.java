public net.sf.json.JSONObject getJsonData() {
    net.sf.json.JSONObject jsonObject = new net.sf.json.JSONObject();
    net.sf.json.JSONArray jsonArray = net.sf.json.JSONArray.fromObject(resultList);
    jsonObject.accumulate("iTotalRecords", totalNum).accumulate("iTotalDisplayRecords", totalNum).accumulate("aaData", jsonArray);
    return jsonObject;
}