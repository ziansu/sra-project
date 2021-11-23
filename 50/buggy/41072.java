@java.lang.Override
public void switchToDetailFragment(comcsse483.github.scoutr.models.Match match) {
    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    ft.replace(R.id.fragment_container, new comcsse483.github.scoutr.fragments.ViewDataFragment());
    ft.addToBackStack("detail");
    ft.commit();
}