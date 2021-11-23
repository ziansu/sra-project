private void launchAdder() {
    getFragmentManager().beginTransaction().replace(R.id.container, new com.mdstudios.themgoals.Goals.GoalAdderFragment()).addToBackStack(null).commit();
}