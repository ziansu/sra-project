@java.lang.Override
protected void onStart() {
    super.onStart();
    adapter = new com.pivotapps.smartcare.smartcare.PatientListAdapter(this, readData());
    setListAdapter(adapter);
}