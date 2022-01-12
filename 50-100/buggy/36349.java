@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.content.Intent intent = new android.content.Intent(this, course.examples.cst2335groupproject.ControlsActivity.class);
    java.lang.String gardenName = lv.getItemAtPosition(position).toString();
    java.lang.String gardenSubstring = gardenName.substring(gardenName.indexOf("("), ((gardenName.indexOf(")")) + 1));
    gardenName = gardenName.replace(gardenSubstring, "");
    intent.putExtra("gardenID", gardenName);
    startActivity(intent);
}