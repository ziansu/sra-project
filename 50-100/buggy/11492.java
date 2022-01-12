public void onItemSelected(android.widget.AdapterView<?> Spinner_D2_Adapter_View, android.view.View v, int position, long row) {
    Spinner_D2_Choice = Spinner_D2_Adapter_View.getItemAtPosition(position).toString();
    setPaths(Spinner_A1_Choice, Spinner_A2_Choice, Spinner_D1_Choice, Spinner_D2_Choice);
    findViewById(R.id.map).invalidate();
    onDraw(tempCanvas);
}