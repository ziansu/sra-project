@java.lang.Override
public void setMenuVisibility(boolean fragmentVisible) {
    super.setMenuVisibility(fragmentVisible);
    com.collage.HomeActivity homeActivity = ((com.collage.HomeActivity) (getActivity()));
    if (homeActivity != null) {
        if (fragmentVisible) {
            hideSystemUI();
            homeActivity.hideHomeNavigation();
        }else {
            showSystemUI();
            homeActivity.showHomeNavigation();
        }
    }
}