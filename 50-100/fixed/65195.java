public void newPOI(android.view.View view) {
    final java.lang.String poiName = poiNameTextView.getText().toString();
    poiNameTextView.clearComposingText();
    if (!(poiName.equalsIgnoreCase(""))) {
        htw_berlin.de.mapmanager.MainActivity.graph.addNewNode(poiName);
        adapter.notifyDataSetChanged();
    }else {
        showSimpleAlert("Invalid POI Name", "Please insert a valid POI Name (minimum 1 non-special Character)");
    }
}