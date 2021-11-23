@java.lang.Override
public void onTextChanged(java.lang.CharSequence charSequence, int i, int i1, int i2) {
    float storeCredit = store_credit.getValueFloat();
    if (storeCredit > (mOrderHistoryListController.getOrder().getMaxStoreCreditRefund())) {
        store_credit.setText(com.magestore.app.util.ConfigUtil.formatNumber(com.magestore.app.util.ConfigUtil.convertToPrice(order.getMaxStoreCreditRefund())));
        order.setStoreCreditRefund(order.getMaxStoreCreditRefund());
    }else {
        order.setStoreCreditRefund(storeCredit);
    }
}