@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle savedInstanceState) {
    super.onSaveInstanceState(savedInstanceState);
    android.app.Fragment fragment = getFragmentManager().findFragmentById(R.id.fragment);
    if (fragment instanceof mmonastyrski.androidtodo.FragmentList) {
        savedInstanceState.putString("fragment", "FragmentList");
    }else {
        savedInstanceState.putString("fragment", "FragmentAddTask");
    }
}