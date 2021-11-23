@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.widget.ImageButton deleteButton = ((android.widget.ImageButton) (view.findViewById(R.id.deletePlaceButton)));
    if ((deleteButton.getVisibility()) == (android.view.View.INVISIBLE)) {
        deleteButton.setVisibility(View.VISIBLE);
    }else {
        deleteButton.setVisibility(View.INVISIBLE);
    }
    return true;
}