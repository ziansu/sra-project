@java.lang.Override
public void onResponse(retrofit2.Call<com.example.ye.gametrade_in.Bean.GameDetailBean> call, retrofit2.Response<com.example.ye.gametrade_in.Bean.GameDetailBean> response) {
    if (((mFragment) != null) && (!(mFragment.isAdded())))
        return ;
    
    showContentLayout();
    mGameDetail = response.body();
    if ((mGameDetail) == null) {
        showErrorLayout();
        return ;
    }
    bindContents(mWishBean, mGameDetail);
}