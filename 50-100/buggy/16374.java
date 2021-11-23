private void saveNewUser(org.json.JSONObject msgData) {
    if ((u) == null) {
        u = new de.dralle.bluetoothtest.DB.User();
        try {
            u.setId(msgData.getInt("ID"));
            u.setName(msgData.getString("Name"));
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        userId = u.getId();
    }
}