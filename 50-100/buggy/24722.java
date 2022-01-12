private void activeAdminManager() {
    android.util.Log.d(com.phoenix.devicemonitor.PreferenceFragment.TAG, "active Admin Manager");
    android.content.Intent intent = new android.content.Intent(android.app.admin.DevicePolicyManager.ACTION_ADD_DEVICE_ADMIN);
    intent.putExtra(DevicePolicyManager.EXTRA_DEVICE_ADMIN, mAdminReceiver);
    intent.putExtra(DevicePolicyManager.EXTRA_ADD_EXPLANATION, getActivity().getString(R.string.admin_warning_descript));
    getActivity().startActivityForResult(intent, 1);
}