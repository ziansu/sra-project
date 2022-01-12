@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((requestCode == (ee364h.wearablehealthtracker.DeviceScanFragment.REQUEST_ENABLE_BT)) && (resultCode == (android.app.Activity.RESULT_CANCELED))) {
        getActivity().finish();
        return ;
    }
    super.onActivityResult(requestCode, resultCode, data);
}