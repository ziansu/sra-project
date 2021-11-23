@java.lang.Override
public int getItemCount() {
    int cnt = 0;
    if ((mRecipes) == null) {
        cnt = 0;
    }
    cnt = mRecipes.size();
    com.lzf.letscook.util.Logger.v(com.lzf.letscook.ui.adapter.ShopAdapter.TAG, ("ShopAdapter.getItemCount() >>> " + cnt));
    return cnt;
}