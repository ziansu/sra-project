@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    journalColor = adapterView.getItemAtPosition(i).toString().trim();
    if (journalColor.equals(Constants.Select_Color)) {
        journalColor = com.cabbage.sdpjournal.Model.Constants.Default_Color;
    }
}