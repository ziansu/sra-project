@java.lang.Override
public void onClick(android.view.View v) {
    org.unpidf.univmobile.ui.activities.HomeActivity a = ((org.unpidf.univmobile.ui.activities.HomeActivity) (getActivity()));
    a.showFragment(new org.unpidf.univmobile.ui.fragments.UniversityNewsFragment(), org.unpidf.univmobile.ui.fragments.UniversityNewsFragment.class.getName(), true);
}