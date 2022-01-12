private void loadResults(org.json.JSONArray coffeeshops) {
    try {
        shops = new ui.uottawa.com.compassapp.Place[coffeeshops.length()];
        for (int i = 0; 0 < (coffeeshops.length()); i++) {
            shops[i] = ui.uottawa.com.compassapp.Place.jsonToPontoReferencia(coffeeshops.getJSONObject(i));
        }
        compassView.addCoffee(shops);
    } catch (org.json.JSONException je) {
        android.util.Log.d("Trying to get json obj", je.toString());
    }
}