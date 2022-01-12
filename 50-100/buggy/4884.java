private <T extends net.tjeerd.onedrive.json.folder.Data> T convertTo(java.lang.Class<T> clazz) {
    com.fasterxml.jackson.databind.ObjectMapper objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
    try {
        java.lang.String json = objectMapper.writerWithType(net.tjeerd.onedrive.json.folder.Data.class).writeValueAsString(this);
        T f = objectMapper.readValue(json, clazz);
        return f;
    } catch (java.lang.Exception e) {
        throw new java.lang.Error(e);
    }
}