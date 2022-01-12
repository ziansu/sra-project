protected org.json.JSONObject setAddresses(org.json.JSONObject patient, org.json.JSONObject content) {
    org.json.JSONObject temp = content;
    if (patient.has("address")) {
        org.json.JSONArray addresses = patient.getJSONArray("address");
        if ((addresses.length()) > 0) {
            org.json.JSONObject address = addresses.getJSONObject(0);
            temp = createAddress(temp, address);
        }
    }
    return temp;
}