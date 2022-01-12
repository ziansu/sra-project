@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.view.View selected_red_bar = view.findViewById(R.id.selected_red_bar);
    changeColorAnimation(selected_red_bar, selected_red_bar.getSolidColor(), getResources().getColor(R.color.RedIntellitap));
    time_slot_selected = view;
}