@java.lang.Override
protected java.util.List<java.util.Map<java.lang.String, java.lang.Object>> doInBackground(java.lang.String... params) {
    java.util.List<java.util.Map<java.lang.String, java.lang.Object>> list;
    java.lang.String str = com.lincanbin.carbonforum.util.HttpUtil.getRequest(params[0]);
    android.util.Log.v("JSON", str);
    list = com.lincanbin.carbonforum.util.HttpUtil.getRequest2List(str, "TopicsArray");
    android.util.Log.v("List", list.toString());
    return list;
}