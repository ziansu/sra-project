public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int pos, long id) {
    java.lang.String tempValue = parent.getItemAtPosition(pos).toString();
    if ((tempValue.length()) < 3) {
        selectNote(pos);
        android.widget.Toast.makeText(this, ("Value: " + tempValue), Toast.LENGTH_SHORT).show();
    }else {
        selectLength(pos);
        android.widget.Toast.makeText(this, ("Length: " + tempValue), Toast.LENGTH_SHORT).show();
    }
}