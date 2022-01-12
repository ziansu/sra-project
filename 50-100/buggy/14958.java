@java.lang.Override
public org.json.JSONArray getQueries() {
    java.util.List l = em.createNamedQuery("Query.findAll", ru.semiot.services.analyzing.database.Query.class).getResultList();
    if ((l == null) || (l.isEmpty())) {
        return null;
    }
    org.json.JSONArray array = new org.json.JSONArray();
    for (java.lang.Object q : l) {
        array.put(new org.json.JSONObject(((ru.semiot.services.analyzing.database.Query) (q))).toString());
    }
    return array;
}