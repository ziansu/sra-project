private void setupViews() {
    fragmentList = ((org.distantshoresmedia.wifiDirect.DeviceListFragment) (getSupportFragmentManager().findFragmentById(R.id.frag_list)));
    fragmentDetails = ((org.distantshoresmedia.wifiDirect.DeviceDetailFragment) (getSupportFragmentManager().findFragmentById(R.id.frag_detail)));
    if ((selectedUri) == null) {
        android.view.View view = findViewById(R.id.device_detail_fragment_base_view);
        if (view != null) {
            view.setVisibility(View.GONE);
        }
    }
}