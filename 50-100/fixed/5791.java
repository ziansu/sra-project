private void initializeSpinner() {
    this.interventionTypes = getResources().getStringArray(R.array.intervention_types);
    android.widget.ArrayAdapter<java.lang.String> spinnerArrayAdapter = new android.widget.ArrayAdapter(this, android.R.layout.simple_spinner_item, this.interventionTypes);
    spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    binding.spinnerIvtype.setAdapter(spinnerArrayAdapter);
    binding.spinnerIvtype.setOnItemSelectedListener(this);
    if ((this.iv.getType()) == null)
        return ;
    
    int pos = spinnerArrayAdapter.getPosition(this.iv.getType());
    binding.spinnerIvtype.setSelection(pos);
}