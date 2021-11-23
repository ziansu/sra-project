@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    if (savedInstanceState != null) {
        workoutId = savedInstanceState.getLong("workoutId");
    }else {
        android.app.FragmentTransaction ft = getChildFragmentManager().beginTransaction();
        com.fig.xuegong.workout.StopwatchFragment stopwatchFragment = new com.fig.xuegong.workout.StopwatchFragment();
        ft.replace(R.id.stopwatch_container, stopwatchFragment);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
    }
    return inflater.inflate(R.layout.fragment_workout_detail, container, false);
}