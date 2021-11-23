@java.lang.Override
@com.giisoo.app.web.admin.Require(login = true, access = "access.menu")
public void onPost() {
    net.sf.json.JSONObject jo = new net.sf.json.JSONObject();
    java.lang.String a = this.getString("a");
    if ("delete".equals(a)) {
        int id = this.getInt("id");
        com.giisoo.app.web.admin.Menu.remove(id);
        jo.put("state", "ok");
    }
    this.response(jo);
}