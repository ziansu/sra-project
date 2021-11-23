@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    hestia.backend.BackendInteractor backendInteractor = hestia.backend.BackendInteractor.getInstance();
    android.content.SharedPreferences prefs = getSharedPreferences(hestia.UI.DeviceListActivity.HESTIA_IP, 0);
}