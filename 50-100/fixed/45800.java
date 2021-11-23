@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.lang.String blood_group = parent.getItemAtPosition(position).toString();
    android.widget.ListView data = ((android.widget.ListView) (findViewById(R.id.lvdata)));
    if (blood_group.equals("All")) {
    }else {
        getdatablood(data, blood_group);
    }
}