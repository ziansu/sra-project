public void save() {
    com.google.gson.Gson gson = new com.google.gson.GsonBuilder().setPrettyPrinting().create();
    me.koenn.cenchants.data.JSONFile.writeJSON(this.file, gson.toJson(new com.google.gson.JsonParser().parse(this.json.toJSONString())));
}