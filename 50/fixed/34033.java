private void open(android.app.Fragment fragment, java.lang.String tag) {
    if ((fragmentManager) != null) {
        fragmentManager.beginTransaction().replace(R.id.main_container, fragment).addToBackStack(tag).commit();
    }
}