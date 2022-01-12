private static com.google.gson.JsonElement getFile(java.lang.String fileName) {
    java.io.File file = new java.io.File((((factionmod.FactionMod.getConfigDir()) + "/") + fileName));
    if (file.exists()) {
        try {
            return new com.google.gson.JsonParser().parse(new java.io.FileReader(file));
        } catch (java.lang.Exception e) {
            factionmod.FactionMod.getLogger().error(("Error on loading file " + fileName));
            e.printStackTrace();
        }
    }
    return null;
}