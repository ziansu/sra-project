@edu.calvin.cs262.POST
@edu.calvin.cs262.Consumes(value = "application/json")
@edu.calvin.cs262.Path(value = "/profile")
@edu.calvin.cs262.Produces(value = "application/json")
public java.lang.String createProfile(java.lang.String data) {
    try {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        edu.calvin.cs262.PlayerProfile player = gson.fromJson(data, edu.calvin.cs262.PlayerProfile.class);
        player.insertIntoDataBase();
        return getProfile(player.ID);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return "{\"err\":\"Unable to create profile.\"}";
}