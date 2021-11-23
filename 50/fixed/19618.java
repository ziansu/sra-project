@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.lang.Integer integer = ((java.lang.Integer) (parent.getItemAtPosition(position)));
    this.prio = integer;
}