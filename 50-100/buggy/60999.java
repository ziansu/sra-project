public org.json.simple.JSONObject getListInJSON() {
    java.util.Map<java.lang.String, java.lang.Boolean> RMap = new java.util.HashMap<>();
    for (Domain.Leerling L : Domain.FactoryLeerlingen.users) {
        java.lang.String name = L.getName();
        java.lang.Boolean result = L.getResult();
        RMap.put(name, result);
    }
    org.json.simple.JSONObject Result = jsonMaster.packJSON(RMap);
    return Result;
}