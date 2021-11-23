private void launchAdder() {
    getFragmentManager().beginTransaction().add(R.id.container, new com.mdstudios.themgoals.Goals.GoalAdderFragment()).addToBackStack(null).commit();
}