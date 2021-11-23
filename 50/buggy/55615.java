@java.lang.Override
public boolean fromJSON(org.json.JSONObject obj) {
    boolean res = super.fromJSON(obj);
    setAdmin(getCreatedBy());
    return res;
}