private java.util.Map<java.lang.String, java.lang.String> getExternsMap() throws java.io.FileNotFoundException {
    if ((this.externsMapFile) != null) {
        java.lang.reflect.Type mapType = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {        }.getType();
        com.google.gson.stream.JsonReader reader = new com.google.gson.stream.JsonReader(new java.io.FileReader(externsMapFile));
        return new com.google.gson.Gson().fromJson(reader, mapType);
    }else {
        return com.google.common.collect.ImmutableMap.of();
    }
}