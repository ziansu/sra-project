void processCoffeeStart(org.json.JSONObject jsonObj) throws org.json.JSONException {
    if (jsonObj.getString("Status").equals("SUCCESS")) {
        brewButton.setEnabled(false);
        brewButton.setText(R.string.button_brew_brewing_text);
    }else {
        brewButton.setText(R.string.button_brew_fail_text);
    }
}