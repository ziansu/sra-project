@java.lang.Override
public void run() {
    java.util.ArrayList<com.example.cyanhearth.wordfinder.Group> temp = sortResults(rawResults, currentSortBy);
    groups.clear();
    groups.addAll(temp);
    handler.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            adapter.notifyDataSetChanged();
        }
    });
}