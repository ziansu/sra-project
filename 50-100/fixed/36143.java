@java.lang.Override
public void onCompleted(java.lang.Exception e, com.google.gson.JsonArray result) {
    if (result != null) {
        for (int i = 0; i < (result.size()); i++) {
            com.google.gson.JsonObject jsonObject = ((com.google.gson.JsonObject) (result.get(i)));
            com.avito.avitotestapp.model.UserModel userModel = new com.avito.avitotestapp.model.UserModel();
            userModel.avatar_url = jsonObject.get("avatar_url").getAsString();
            userModel.login = jsonObject.get("login").getAsString();
            userModel.save();
        }
    }
}