@java.lang.Override
protected void onPostExecute(org.json.JSONObject jsonObject) {
    if (jsonObject != null) {
        try {
            currentLocation = jsonObject.getString("address");
            if (isDefault) {
                addDefaultLocation();
                isDefault = false;
            }
            myPlacesLoadFinish(currentLocation, true);
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
    }else {
        myPlacesLoadFinish(null, false);
        android.widget.Toast.makeText(activity, R.string.no_internet, Toast.LENGTH_LONG).show();
    }
}