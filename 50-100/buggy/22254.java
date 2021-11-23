@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case android.content.DialogInterface.BUTTON_POSITIVE :
            World.SELECTED_DAY.deleteTimeInterval(World.selected_time_interval);
            ((android.widget.BaseAdapter) (World.mainActivity.mainListView.getAdapter())).notifyDataSetChanged();
            break;
        case android.content.DialogInterface.BUTTON_NEGATIVE :
            break;
    }
}