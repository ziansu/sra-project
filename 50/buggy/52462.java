public void countGlobalVariables() {
    org.json.JSONArray variables = stage.optJSONArray("variables");
    if (variables == null) {
        globalVariables = 0;
    }else {
        globalVariables = variables.length();
    }
}