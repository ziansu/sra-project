public void addItemsOnSpinner() {
    match_list = new java.util.ArrayList<java.lang.String>();
    for (wilsonvillerobotics.com.xeroscoutercollect.models.TeamMatchModel tempMatch : matchObjList) {
        match_list.add(java.lang.String.valueOf(java.lang.Integer.valueOf(tempMatch.getMatchNumber())));
    }
    dataAdapter = new android.widget.ArrayAdapter<java.lang.String>(this, android.R.layout.simple_spinner_item, match_list);
    dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    spinner_match_list.setAdapter(dataAdapter);
}