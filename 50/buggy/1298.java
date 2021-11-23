@java.lang.Override
public void onRefresh() {
    themesList.clear();
    new com.lovejoy777.showcase.Screen1.JSONAsyncTask().execute();
    onItemsLoadComplete();
}