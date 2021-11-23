public void onSearchButtonClick(android.view.View view) throws org.json.JSONException {
    input = searchText.getText().toString();
    input2 = searchText.getText().toString();
    getJsonFromUrl(input);
    getShortPlot(input2);
    validateMovie();
    if (response) {
        extractJson(jsonLongPlot);
        findViews();
        setContent();
    }else {
        jsonLongPlot = null;
    }
}