public void showDialog() {
    android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
    android.app.Fragment prev = getFragmentManager().findFragmentByTag("dialog");
    if (prev != null) {
        ft.remove(prev);
    }
    ft.addToBackStack(null);
    com.packants.android.Fragments.AcceptTaskFragment newFragment = new com.packants.android.Fragments.AcceptTaskFragment();
    ft.add(newFragment, "").commit();
}