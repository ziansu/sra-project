@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if (which == 0) {
        sortByMostRecent();
        populateAdapter(pathAndDataMap);
        adapter.notifyDataSetChanged();
    }else
        if (which == 1) {
            if (allowed) {
                sortByDistance();
                populateAdapter(pathAndDataMap);
                adapter.notifyDataSetChanged();
            }else {
                checkPermission();
            }
        }else
            if (which == 2) {
                sortByPopularity();
                populateAdapter(pathAndDataMap);
                adapter.notifyDataSetChanged();
            }
        
    
}