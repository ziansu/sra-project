public com.example.mbankole.tripplanner.fragments.PlanListFragment getPlanListFragment() {
    if ((planListFragment) == null) {
        planListFragment = com.example.mbankole.tripplanner.fragments.PlanListFragment.newInstance();
        planListFragment.locations = places;
        planListFragment.refresh();
        planListFragment.exploreActivity = exploreActivity;
    }
    return planListFragment;
}