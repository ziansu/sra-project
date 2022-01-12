@java.lang.Override
public void onStart() {
    turnScreenOn();
    buildDialog(getResources().getString(R.string.service_plug_earphone_title), getResources().getString(R.string.service_plug_earphone_detail));
}