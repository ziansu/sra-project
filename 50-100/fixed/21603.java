private void processAddLike(java.lang.String json) throws org.json.JSONException {
    java.lang.reflect.Type listType = new com.google.gson.reflect.TypeToken<java.util.List<com.runningracehisotry.models.Like>>() {    }.getType();
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.util.List<com.runningracehisotry.models.Like> listLike = gson.fromJson(json, listType);
    if ((listLike != null) && ((listLike.size()) > 0)) {
        addLikeForRace(listLike);
        if ((mRacesSortAdapter) != null) {
            mRacesSortAdapter.notifyDataSetChanged();
        }
    }
}