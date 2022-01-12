@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_subworkout, container, false);
    android.widget.ListView listView = ((android.widget.ListView) (view.findViewById(R.id.subWokoutListView)));
    listView.setAdapter(getAdapter());
    openWorkoutOnClick(listView);
    addExerciseToSubWorkout(listView);
    setFloatingActionButton();
    return view;
}