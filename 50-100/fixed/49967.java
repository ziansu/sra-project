@java.lang.Override
public void requestSuccess(java.lang.String result) throws java.lang.Exception {
    org.json.JSONObject object = new org.json.JSONObject(result);
    java.lang.String flag = object.getString("error");
    if (flag.equals("ok")) {
        org.json.JSONObject object1 = new org.json.JSONObject(object.getString("object"));
        tec_id = object1.getInt("articleID");
        handler.sendEmptyMessage(ConstantUtils.ARTI_ADD_DATA);
    }
}