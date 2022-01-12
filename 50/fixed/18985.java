public void refreshList(istic.gla.groupb.nivimoju.entity.Intervention intervention) {
    this.intervention = intervention;
    istic.gla.groupeb.flerjeco.agent.planZone.DroneListFragment droneListFragment = ((istic.gla.groupeb.flerjeco.agent.planZone.DroneListFragment) (getSupportFragmentManager().findFragmentById(R.id.resources_fragment)));
    if (droneListFragment != null) {
        droneListFragment.refresh(intervention);
    }
}