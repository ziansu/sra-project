@java.lang.Override
public void onListItemClick(android.widget.ListView l, android.view.View v, int position, long id) {
    com.yandex.disk.client.ListItem item = ((com.yandex.disk.client.ListItem) (getListAdapter().getItem(position)));
    if (item.isCollection()) {
        changeDir(item);
    }else {
        if (item.getContentType().contains("image")) {
            startActivity(com.zerogerc.photoframe.preview.PreviewActivity.getIntentForStart(getContext(), images, credentials, numberOfImage.get(position)));
        }
    }
}