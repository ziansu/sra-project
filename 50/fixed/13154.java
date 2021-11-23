public org.vgdev.packagepanic.Mail readFromJSON(org.json.JSONObject json) {
    y = json.optInt("x", 0);
    x = json.optInt("y", 0);
    return this;
}