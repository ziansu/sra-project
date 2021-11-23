@java.lang.Override
public void onListItemClick(ru.cfif.cs.android.slideshow.ListView listView, ru.cfif.cs.android.slideshow.View view, int position, long id) {
    com.yandex.disk.client.ListItem item = ((com.yandex.disk.client.ListItem) (getListAdapter().getItem(position)));
    java.lang.System.out.println(("onListItemClick(): " + item));
    if (item.isCollection()) {
        changeDir(item.getFullPath());
    }
}