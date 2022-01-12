private void load() {
    if (!(this.file.exists())) {
        this.json = new org.json.simple.JSONObject();
    }else {
        this.json = me.koenn.cenchants.data.JSONFile.parseJSON(this.file);
    }
}