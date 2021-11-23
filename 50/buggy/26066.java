@java.lang.Override
public void onClick(android.view.View view) {
    android.widget.Toast.makeText(getActivity(), "WYBIERZ!", Toast.LENGTH_SHORT).show();
    chooseExercise.show(getFragmentManager(), "choose");
}