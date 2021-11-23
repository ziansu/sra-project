@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    editText = ((android.widget.EditText) (getActivity().findViewById(R.id.search_field)));
    outState.putSerializable("adapter", artistArrayList);
    outState.putString("text", editText.getText().toString());
}