public void setProps() {
    name = ((android.widget.TextView) (activity.findViewById(R.id.name_entry))).getText().toString();
    directions = ((android.widget.TextView) (activity.findViewById(R.id.direction_entry))).getText().toString();
    notes = ((android.widget.TextView) (activity.findViewById(R.id.notes_entry))).getText().toString();
    imageLink = "Custom";
    ingredients = "Not implemented";
}