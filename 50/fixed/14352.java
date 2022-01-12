private ro.dsci.internship.User toUser(org.json.JSONObject object) {
    return new ro.dsci.internship.User(object.getString("_id"), object.getString("userName"), object.getString("givenName"), object.getString("sn"), object.getString("mail"));
}