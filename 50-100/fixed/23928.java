public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int pos, long id) {
    java.lang.String tempValue = parent.getItemAtPosition(pos).toString();
    if ((tempValue.length()) < 3) {
        selectNote(pos, tempValue);
    }else {
        selectLength(pos);
    }
}