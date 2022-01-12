protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_fragment);
    radioGroup = ((android.widget.RadioGroup) (findViewById(R.id.rg_tab)));
    fragmentManager = getFragmentManager();
    radioGroup.setOnCheckedChangeListener(radioGroupListener);
    gattServiceIntent = new android.content.Intent(this, edu.nthu.nmsl.itri_app.BluetoothLeService.class);
    bindService(gattServiceIntent, mServiceConnection, android.content.Context.BIND_AUTO_CREATE);
}