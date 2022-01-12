@java.lang.Override
public boolean callback() {
    java.lang.String fileName = trainingName.getText().toString();
    if (fileName.isEmpty()) {
        android.widget.Toast.makeText(getContext(), R.string.select_training_name, Toast.LENGTH_SHORT).show();
        return false;
    }
    if (fileName.contains("\\")) {
        android.widget.Toast.makeText(getContext(), "Invalid file name", Toast.LENGTH_SHORT).show();
        return false;
    }
    listener.onFragmentInteraction(AppCompatActivity.RESULT_OK, getRequestCode(), fileName);
    return true;
}