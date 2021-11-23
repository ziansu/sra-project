@java.lang.Override
public void setMenuVisibility(boolean fragmentVisible) {
    super.setMenuVisibility(fragmentVisible);
    this.fragmentVisible = fragmentVisible;
    com.collage.HomeActivity homeActivity = ((com.collage.HomeActivity) (getActivity()));
    if (homeActivity != null) {
        if (fragmentVisible) {
            hideSystemUI();
            homeActivity.hideHomeNavigation();
        }
    }
}