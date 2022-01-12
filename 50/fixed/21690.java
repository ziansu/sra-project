@java.lang.Override
public void onClick(android.view.View view) {
    if ((context) instanceof internetofeveryone.ioe.Downloads.DownloadsView) {
        ((internetofeveryone.ioe.Downloads.DownloadsView) (context)).onClickOpen(getItem(position));
    }
}