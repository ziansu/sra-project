public void initService() {
    mServiceIntent.putExtra(getString(R.string.service_state_tag), getString(R.string.service_state_init));
    startService(mServiceIntent);
}