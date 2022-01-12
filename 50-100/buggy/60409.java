@java.lang.Override
public void onScrolled(android.support.v7.widget.RecyclerView recyclerView, int dx, int dy) {
    super.onScrolled(recyclerView, dx, dy);
    android.util.Log.d("myr", ("height:" + dy));
    if (dy > (com.example.hmyd.mytestandroid_studio.tools.Utils.SCREEN_HEIGHT)) {
        back_top.setVisibility(View.VISIBLE);
    }else {
        back_top.setVisibility(View.INVISIBLE);
    }
}