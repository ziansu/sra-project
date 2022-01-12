public void setTheme3(org.springfield.lou.application.types.Screen s, java.lang.String c) {
    s.setProperties(c);
    org.springfield.fs.FsNode node = themes.getLayoutBy(3);
    setCurrentTheme(node);
    org.json.simple.JSONObject message = new org.json.simple.JSONObject();
    message.put("style", node.getProperty("css"));
    s.putMsg("layout", "", (("setTheme(" + message) + ")"));
}