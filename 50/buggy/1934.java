@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    _address = getArguments().getString("address");
    _ble = nl.dobots.crownstone.CrownstoneDevApp.getInstance().getBle();
    createGraph();
}