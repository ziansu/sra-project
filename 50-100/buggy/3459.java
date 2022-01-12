@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.lang.String clickedItem = java.lang.String.valueOf(parent.getItemAtPosition(position));
    android.content.Intent i = new android.content.Intent(getActivity(), com.example.celien.gui_draft.CarsDetailsList.class);
    i.putExtra("brand", clickedItem);
    startActivity(i);
    android.widget.Toast.makeText(getActivity(), clickedItem, Toast.LENGTH_SHORT).show();
}