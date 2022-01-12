private void showAlerts() {
    atHome = false;
    title.setText(R.string.title_alerts);
    adapter.reset();
    adapter.addFragment(Fragments.Builder.buildAlertsFragment(null), "Alerts");
    adapter.addFragment(new org.hawkular.client.android.fragment.TriggersFragment(), "Triggers");
    adapter.notifyDataSetChanged();
}