public static org.json.JSONObject stripJsonMetadata(org.json.JSONObject json) {
    if (gov.nasa.jpl.mbee.util.Debug.isOn())
        gov.nasa.jpl.view_repo.util.NodeUtil.logger.debug(("stripJsonMetadata -> " + json));
    
    json.remove("jsonString");
    json.remove("jsonString4");
    if (gov.nasa.jpl.mbee.util.Debug.isOn())
        gov.nasa.jpl.view_repo.util.NodeUtil.logger.debug(("stripJsonMetadata -> " + json));
    
    return json;
}