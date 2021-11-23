@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    scheduler = isst.fraunhofer.de.ompi.adapter.Scheduler.getInstance(this);
    stateAdapter = isst.fraunhofer.de.ompi.adapter.StateAdapter.getInstance(this);
    android.content.Intent intent = new android.content.Intent(this, scheduler.getLastActivity());
    startActivity(intent);
}