@java.lang.Override
protected java.util.Map<java.lang.String, java.lang.String> getParams() throws com.android.volley.AuthFailureError {
    java.util.Map<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
    map.put("table", model.getTable());
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.lang.String reserve = gson.toJson(model.getReserve());
    java.lang.System.out.println(reserve);
    map.put("reserve", reserve);
    map.put("price", java.lang.Double.toString(model.getPrice()));
    return map;
}