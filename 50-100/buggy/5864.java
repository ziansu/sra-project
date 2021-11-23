protected org.json.JSONObject setAddresses(org.json.JSONObject patient, org.json.JSONObject content) {
    if (patient.has("address")) {
        org.json.JSONArray addresses = patient.getJSONArray("address");
        if ((addresses.length()) > 0) {
            org.json.JSONObject address = addresses.getJSONObject(0);
            content = createAddress(content, address);
        }
    }
    return content;
}