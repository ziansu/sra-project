@java.lang.Override
public void onScrolled(android.support.v7.widget.RecyclerView recyclerView, int dx, int dy) {
    super.onScrolled(recyclerView, dx, dy);
    if (dy > 0) {
        scrollDirection = com.chernandezgil.farmacias.Utilities.Constants.SCROLL_UP;
        android.util.Log.i("RecyclerView scrolled: ", "scroll up!");
        android.util.Log.i("RecyclerView scrolled: ", ("dy:" + dy));
    }else {
        scrollDirection = com.chernandezgil.farmacias.Utilities.Constants.SCROLL_DOWN;
        android.util.Log.i("RecyclerView scrolled: ", "scroll down!");
        android.util.Log.i("RecyclerView scrolled: ", ("dy:" + dy));
    }
}