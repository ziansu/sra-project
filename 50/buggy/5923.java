@java.lang.Override
public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    if (favorite) {
        menu.getItem(1).setTitle("查看全部");
    }else {
        menu.getItem(1).setTitle("查看收藏");
    }
    return true;
}