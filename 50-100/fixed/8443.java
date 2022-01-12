@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    if (savedInstanceState != null) {
        workoutId = savedInstanceState.getLong(hfad.com.workout.WorkoutDetailFragment.WORKOUT_ID);
    }else {
        android.support.v4.app.FragmentTransaction ft = getChildFragmentManager().beginTransaction();
        hfad.com.workout.StopwatchFragment stopwatchFragment = new hfad.com.workout.StopwatchFragment();
        ft.replace(R.id.stopwatch_container, stopwatchFragment);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
    }
    return inflater.inflate(R.layout.fragment_workout_detail, container, false);
}