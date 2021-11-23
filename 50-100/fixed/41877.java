private java.util.ArrayList<examproject.group22.roominator.Models.User> getUsersFromJson(org.json.JSONArray users) {
    java.util.ArrayList<examproject.group22.roominator.Models.User> usersArray = new java.util.ArrayList<examproject.group22.roominator.Models.User>();
    try {
        org.json.JSONArray array = users;
        for (int i = 0; i < (array.length()); i++) {
            org.json.JSONObject object = array.getJSONObject(i);
            usersArray.add(parseOneUser(object));
        }
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    return usersArray;
}