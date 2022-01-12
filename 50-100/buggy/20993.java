@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.view.View selected_red_bar = view.findViewById(R.id.selected_red_bar);
    if ((time_slot_selected) != null) {
        android.view.View selected_red_bar2 = time_slot_selected.findViewById(R.id.selected_red_bar);
        selected_red_bar2.setBackgroundColor(getResources().getColor(android.R.color.white));
    }
    changeColorAnimation(selected_red_bar, selected_red_bar.getSolidColor(), getResources().getColor(R.color.RedIntellitap));
    time_slot_selected = view;
}