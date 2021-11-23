public void setParameterSpinner(android.widget.Spinner parameterSpinner) {
    this.parameterSpinner = parameterSpinner;
    this.parameterSpinner.setOnItemSelectedListener(parameterListener);
    java.util.ArrayList<java.lang.String> parameterList = new java.util.ArrayList<>();
    parameterList.add("not selected");
    android.widget.ArrayAdapter<java.lang.String> parameterAdapter = new android.widget.ArrayAdapter(context, R.layout.cell_simple_dropdown_text, parameterList);
    this.parameterSpinner.setAdapter(parameterAdapter);
}