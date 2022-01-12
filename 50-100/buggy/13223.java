@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_reader);
    android.app.FragmentTransaction transaction = getFragmentManager().beginTransaction();
    ninja.dudley.yamr.ui.fragments.ProviderViewer providerViewer = new ninja.dudley.yamr.ui.fragments.ProviderViewer();
    transaction.replace(R.id.reader, providerViewer);
    transaction.commit();
}