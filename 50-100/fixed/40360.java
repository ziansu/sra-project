@java.lang.Override
public void onTextChanged(java.lang.CharSequence charSequence, int i, int i1, int i2) {
    float giftCard = gift_card.getValueFloat();
    if (giftCard > (com.magestore.app.util.ConfigUtil.convertToPrice(mOrderHistoryListController.getOrder().getMaxGiftCardRefund()))) {
        gift_card.setText(com.magestore.app.util.ConfigUtil.formatNumber(com.magestore.app.util.ConfigUtil.convertToPrice(order.getMaxGiftCardRefund())));
        order.setGiftCardRefund(giftCard);
    }else {
        order.setGiftCardRefund(giftCard);
    }
}