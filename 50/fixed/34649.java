protected void Back() {
    android.support.v4.app.FragmentManager FM = getActivity().getSupportFragmentManager();
    FM.beginTransaction().remove(this).commit();
}