@java.lang.Override
public void onLoaded(net.xuite.blog.ray00000test.library.comicsdk.Comic result) {
    net.xuite.blog.ray00000test.rdownloadcomic.ui.JDownLoadUIAct down = mComicListPool.get(comic.getId());
    down.setDataTableList(mTableList);
    down.setComic(result);
    if (down != null) {
        down.setVisible(true);
        down.toFront();
    }
}