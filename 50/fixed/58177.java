public void onClick(android.view.View v) {
    android.app.FragmentManager fragmentManager = getFragmentManager();
    android.app.FragmentTransaction ft = fragmentManager.beginTransaction();
    ft.replace(R.id.fragment_container, new com.hsfl.speakshot.ui.ReadFragment());
    ft.commit();
}