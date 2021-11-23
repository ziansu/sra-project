@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.widget.Toast.makeText(this, ("You Clicked at " + (nl.sm42.ocealerts.activitys.Administration.getInstance().getPrinterNames()[(+position)])), Toast.LENGTH_SHORT).show();
    android.content.Intent i = new android.content.Intent(getApplicationContext(), nl.sm42.ocealerts.activitys.PrinterDetailActivity.class);
}