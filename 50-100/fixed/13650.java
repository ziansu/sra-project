@org.xutils.view.annotation.Event(value = R.id.goPayBtn)
private void goPay(android.view.View view) {
    double goodNum = 0;
    for (com.cqgk.clerk.bean.normal.ProductDtlBean good : myGood) {
        goodNum += good.getNum();
    }
    if (0 == goodNum) {
        showToast("未选择商品");
        return ;
    }
    com.cqgk.clerk.helper.NavigationHelper.getInstance().startPayBill(myGood);
}