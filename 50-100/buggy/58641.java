public void launchMultiSelectMenu() {
    final android.app.Activity activity = ((fr.wildcodeschool.haa.waxym.MainActivity) (getContext()));
    android.app.FragmentManager fm = activity.getFragmentManager();
    android.app.FragmentTransaction ft = fm.beginTransaction();
    fr.wildcodeschool.haa.waxym.MultiSelectMenuFragment fragment = new fr.wildcodeschool.haa.waxym.MultiSelectMenuFragment();
    ft.add(R.id.list_fragment_container, fragment, "prout").commit();
}