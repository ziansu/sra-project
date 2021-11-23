protected static void saveWellMap(java.util.Map<java.lang.String, data.Well> wellmap, java.lang.String name, java.lang.String dir) throws java.io.IOException {
    java.lang.String path = (dir == null) ? data.DataUtils.CONFIG_DIR : dir;
    java.lang.String filename = (name == null) ? data.DataUtils.CONFIG_WELLS : name;
    java.io.FileWriter out = new java.io.FileWriter(new java.io.File(path));
    out.write(org.json.simple.JSONObject.toJSONString(wellmap));
    out.flush();
    out.close();
}