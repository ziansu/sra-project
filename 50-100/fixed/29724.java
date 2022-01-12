private void getCartList() {
    if (com.plmt.boommall.utils.UserInfoManager.getLoginIn(mContext)) {
        com.plmt.boommall.ui.activity.ShopCartActivity.mCartNullLl.setVisibility(View.VISIBLE);
        com.plmt.boommall.ui.activity.ShopCartActivity.mCartNullTv.setVisibility(View.VISIBLE);
        com.plmt.boommall.ui.activity.ShopCartActivity.mCartNotLoginLl.setVisibility(View.GONE);
        mProgressDialog = new com.plmt.boommall.ui.view.CustomProgressDialog(mContext);
        mProgressDialog.show();
        com.plmt.boommall.network.logic.CartLogic.getList(mContext, mHandler);
    }else {
        com.plmt.boommall.ui.activity.ShopCartActivity.mCartNullLl.setVisibility(View.VISIBLE);
        com.plmt.boommall.ui.activity.ShopCartActivity.mCartNullTv.setVisibility(View.VISIBLE);
        com.plmt.boommall.ui.activity.ShopCartActivity.mCartNotLoginLl.setVisibility(View.VISIBLE);
        mGoodsLv.setVisibility(View.GONE);
    }
}