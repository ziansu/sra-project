private void removeCharacter(org.json.JSONObject data) {
    try {
        int id = data.getInt("id");
        for (int i = 0; i < (characters.size()); i++) {
            if ((characters.get(i).getId()) == id) {
                characters.remove(i);
            }
        }
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}