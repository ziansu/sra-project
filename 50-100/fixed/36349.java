@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.content.Intent intent = new android.content.Intent(this, course.examples.cst2335groupproject.ControlsActivity.class);
    java.lang.String gardenName = lv.getItemAtPosition(position).toString();
    if (gardenName.contains("\n")) {
        gardenName = gardenName.substring(0, gardenName.indexOf("\n"));
    }
    intent.putExtra("gardenID", gardenName);
    startActivity(intent);
}