private int getFirstVisiblePosition() {
    int firstVisiblePos = 0;
    app.com.tvrecyclerview.LayoutManager layoutManager = getLayoutManager();
    if (layoutManager instanceof android.support.v7.widget.LinearLayoutManager) {
        firstVisiblePos = ((android.support.v7.widget.LinearLayoutManager) (layoutManager)).findFirstVisibleItemPosition();
    }else
        if (layoutManager instanceof app.com.tvrecyclerview.ModuleLayoutManager) {
            firstVisiblePos = ((app.com.tvrecyclerview.ModuleLayoutManager) (layoutManager)).findFirstVisibleItemPosition();
        }
    
    return firstVisiblePos;
}