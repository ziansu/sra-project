private void setupViews() {
    fragmentList = ((org.distantshoresmedia.wifiDirect.DeviceListFragment) (getSupportFragmentManager().findFragmentById(R.id.frag_list)));
    fragmentDetails = ((org.distantshoresmedia.wifiDirect.DeviceDetailFragment) (getSupportFragmentManager().findFragmentById(R.id.frag_detail)));
    if ((selectedUri) == null) {
        findViewById(R.id.device_detail_fragment_base_view).setVisibility(View.GONE);
    }
}