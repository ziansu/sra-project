@java.lang.Override
protected void onStart() {
    super.onStart();
    adapter = new com.pivotapps.smartcare.smartcare.PatientListAdapter(getApplicationContext(), readData());
    setListAdapter(adapter);
}