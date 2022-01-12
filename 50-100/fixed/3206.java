public void add(int oid, me.doubledutch.pikadb.JSONObject obj) throws java.io.IOException, me.doubledutch.pikadb.JSONException {
    for (java.lang.String key : me.doubledutch.pikadb.JSONObject.getNames(obj)) {
        me.doubledutch.pikadb.Column col = getColumn(key);
        java.lang.Object value = obj.get(key);
        me.doubledutch.pikadb.Variant variant = me.doubledutch.pikadb.Variant.createVariant(oid, value);
        col.append(variant);
    }
}