public void onItemSelected(android.widget.AdapterView<?> Spinner_D2_Adapter_View, android.view.View v, int position, long row) {
    Spinner_D2_Choice = Spinner_D2_Adapter_View.getItemAtPosition(position).toString();
    if (((((Spinner_A1_Choice) != null) && ((Spinner_A2_Choice) != null)) && ((Spinner_D1_Choice) != null)) && ((Spinner_D2_Choice) != null)) {
        setPaths(Spinner_A1_Choice, Spinner_A2_Choice, Spinner_D1_Choice, Spinner_D2_Choice);
        onDraw(tempCanvas);
    }
    findViewById(R.id.map).invalidate();
}