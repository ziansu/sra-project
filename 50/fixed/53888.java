@java.lang.Override
public boolean test(org.json.JSONObject jsonObject) {
    java.lang.String rtime = jsonObject.getString("rtime");
    return (!(rtime.isEmpty())) && (predicate.test(java.lang.Long.parseLong(rtime)));
}