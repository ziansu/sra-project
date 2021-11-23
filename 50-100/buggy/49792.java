void processCoffeeStart(org.json.JSONObject jsonObj) throws org.json.JSONException {
    brewButton.setEnabled(false);
    if (jsonObj.getString("Status").equals("SUCCESS")) {
        brewButton.setText(R.string.button_brew_brewing_text);
    }else {
        brewButton.setText(R.string.button_brew_fail_text);
    }
}