public void show(android.support.v4.app.FragmentManager fragmentManager, @android.support.annotation.IdRes
int viewId) {
    fragmentManager.beginTransaction().replace(viewId, this).commit();
}