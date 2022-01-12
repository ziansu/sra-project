@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.recycler_view);
    android.support.v7.widget.RecyclerView recyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.rv)));
    net.signagewidgets.serial.model.RemoteControl[] remoteControlData = getControls();
    android.support.v7.widget.LinearLayoutManager layoutManager = new android.support.v7.widget.LinearLayoutManager(context);
    recyclerView.setLayoutManager(layoutManager);
    net.signagewidgets.serial.util.RVAdapter rvAdapter = new net.signagewidgets.serial.util.RVAdapter(remoteControlData);
    recyclerView.setAdapter(rvAdapter);
}