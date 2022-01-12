protected void addFragment(int contentResId, android.support.v4.app.Fragment fragment, java.lang.String tag) {
    fragmentManager.beginTransaction().add(contentResId, fragment, tag).addToBackStack(tag).commit();
}