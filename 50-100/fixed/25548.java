private static java.lang.String getSLATime() {
    java.lang.String json = main.GetJSON.getRawSLA(sla.Tracker.curl);
    java.lang.String empty = main.Utils.find("empty", json);
    java.lang.String result;
    if (empty == "false") {
        result = main.Utils.find("changed-at", json);
    }else {
        return "no issue";
    }
    return result;
}