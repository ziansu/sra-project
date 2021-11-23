@java.lang.Override
public void onClick(android.view.View v) {
    container.removeAllViewsInLayout();
    if ((sort_mode) == true) {
        change_image_sort = ((android.widget.ImageButton) (findViewById(R.id.sort_toolbar)));
        change_image_sort.setImageResource(R.drawable.ic_sort_a_to_z);
        sort_mode = false;
    }else
        if ((sort_mode) == false) {
            change_image_sort.setImageResource(R.drawable.ic_sort_icon);
            sort_mode = true;
        }
    
}