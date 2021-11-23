public com.google.gson.JsonArray getGardenLocationsJSON(java.lang.String uploadID) {
    if (!(umm3601.digitalDisplayGarden.ExcelParser.isValidUploadId(db, uploadID)))
        return null;
    
    java.lang.String[] beds = getGardenLocations(uploadID);
    com.google.gson.JsonArray out = new com.google.gson.JsonArray();
    for (int i = 0; i < (beds.length); i++) {
        com.google.gson.JsonObject bed = new com.google.gson.JsonObject();
        bed.addProperty("_id", beds[i]);
        out.add(bed);
    }
    return out;
}