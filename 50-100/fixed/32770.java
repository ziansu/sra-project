private void showLastMapData() {
    try {
        org.json.JSONObject jsonObj = new org.json.JSONObject(proj.Position.JsonParser.getJsonRespon((((((Global.SDPathRoot) + "/") + (Global.MapDirName)) + "/") + "last.json")));
        java.lang.String mapId = jsonObj.getString("mapID");
        showMapData(mapId);
        pointTitle.setText("�̪񪺦a��!");
    } catch (org.json.JSONException e) {
        e.printStackTrace();
        pointTitle.setText("�S���̪񪺦a��!");
    }
}