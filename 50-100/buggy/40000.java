@java.lang.Override
public void onClick(android.view.View v) {
    if ((sortedList.size()) > 0) {
        showMostFrequentTag(java.util.Collections.max(sortedList));
        adapter.resetSelectedTags();
    }else {
        android.widget.Toast.makeText(context, "TAG list is Empty !", Toast.LENGTH_SHORT).show();
    }
    adapter.resetSelectedTags();
}