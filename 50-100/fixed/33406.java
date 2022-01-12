@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    this.context = getApplicationContext();
    attachGuiObjects();
    styleGuiObjects();
    sk.berops.android.vehiculum.gui.MainActivity.dataHandler = sk.berops.android.vehiculum.gui.MainActivity.getDataHandler(this);
    if ((sk.berops.android.vehiculum.gui.MainActivity.garage) == null) {
        loadGarage();
    }
}