public void closeFragment() {
    android.support.v4.app.FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
    fragmentManager.beginTransaction().remove(this).commit();
    fragmentManager.popBackStackImmediate();
}