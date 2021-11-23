public net.sf.json.JSONObject toJsonObj() {
    net.sf.json.JSONObject obj = new net.sf.json.JSONObject();
    obj.accumulate("id", id);
    obj.accumulate("date", date);
    obj.accumulate("dbp", dbp);
    obj.accumulate("sbp", sbp);
    obj.accumulate("heartrate", heartrate);
    obj.accumulate("dosed", dosed);
    return obj;
}