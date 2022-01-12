@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.widget.TextView et = ((android.widget.TextView) (parent.findViewById(R.id.txtTitle)));
    mListener.onRecipeSelected(et.getText().toString());
}