private void addBrowserFragment() {
    android.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
    fragmentTransaction.add(R.id.theme_browser_container, mThemeBrowserFragment);
    fragmentTransaction.addToBackStack(null);
    fragmentTransaction.commit();
}