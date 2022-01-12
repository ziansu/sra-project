private void uploadClients(com.google.gson.JsonArray jsonArray) {
    for (com.google.gson.JsonElement jsonElement : jsonArray) {
        long harvestClientId = java.lang.Long.parseLong(jsonElement.getAsJsonObject().get("client").getAsJsonObject().get("id").toString());
        java.lang.String clientName = jsonElement.getAsJsonObject().get("client").getAsJsonObject().get("name").toString();
        toggl.upsertClient(harvestClientId, clientName);
        break;
    }
}