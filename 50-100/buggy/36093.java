private java.lang.Long turnThisDamnObjIntoLong(org.json.simple.JSONObject o, java.lang.String key) {
    java.lang.Number x = 0;
    java.lang.Long v = null;
    try {
        x = ((java.lang.Number) (o.get(key)));
        v = new java.lang.Long(((int) (x)));
    } catch (java.lang.ClassCastException f) {
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}