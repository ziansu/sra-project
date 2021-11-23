@java.lang.Override
public void onFailure(int reasonCode) {
    android.widget.Toast.makeText(getActivity(), ("Discovery Failed : " + reasonCode), Toast.LENGTH_SHORT).show();
    com.alanddev.gmscall.fragment.WifiDirectFragment.time_scan_fails = java.lang.System.currentTimeMillis();
    (com.alanddev.gmscall.fragment.WifiDirectFragment.number_scan_fails)++;
}