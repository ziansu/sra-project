@java.lang.Override
public void onItemClick(final android.widget.AdapterView<?> parent, final android.view.View view, final int position, final long id) {
    org.deviceconnect.android.deviceplugin.irkit.settings.activity.IRKitDeviceListActivity activity = ((org.deviceconnect.android.deviceplugin.irkit.settings.activity.IRKitDeviceListActivity) (getActivity()));
    activity.startApp(IRKitDeviceListActivity.MANAGE_VIRTUAL_DEVICE_PAGE, mDevices.get(position).getName());
}