private void setupTabs() {
    adapter = new mac2015.lavit.ui.custom.tabs.IconTabAdapter(getFragmentManager(), getBaseContext());
    adapter.addTabs(java.util.Arrays.asList(projectInfoDetailsFragment, projectInfoFeedbackFragment));
    viewPager.setOffscreenPageLimit(2);
    viewPager.setAdapter(adapter);
}