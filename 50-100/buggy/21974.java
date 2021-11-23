@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle savedInstanceState) {
    super.onSaveInstanceState(savedInstanceState);
    android.app.Fragment fragment = getFragmentManager().findFragmentById(R.id.fragment);
    if (fragment instanceof mmonastyrski.androidtodo.FragmentList) {
        savedInstanceState.putString("fragment", "FragmentList");
    }else {
        android.widget.EditText newTask = ((android.widget.EditText) (findViewById(R.id.newTask)));
        java.lang.String description = newTask.getText().toString();
        savedInstanceState.putString("description", description);
        savedInstanceState.putString("fragment", "FragmentAddTask");
    }
}