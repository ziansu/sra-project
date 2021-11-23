private java.util.List<com.slheavner.wvubus.models.Bus> readBusJson() throws java.io.IOException {
    java.io.FileInputStream fis = this.getContext().openFileInput("buses.json");
    byte[] bytes = new byte[fis.available()];
    fis.read(bytes);
    java.lang.String json = new java.lang.String(bytes);
    com.slheavner.wvubus.models.Bus[] buses = new com.google.gson.Gson().fromJson(json, com.slheavner.wvubus.models.Bus[].class);
    return orderBusList(buses);
}