@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.link_to_addresses :
            startForResult(com.tallty.smart_life_android.fragment.cart.SelectAddress.newInstance(), com.tallty.smart_life_android.fragment.cart.REQ_CODE);
            break;
        case R.id.submit_order :
            if (has_address) {
                if (Const.TYPE_NORMAL.equals(type))
                    submitOrderAndPay();
                else
                    if (Const.TYPE_PROMOTION.equals(type))
                        submitPromotionOrder(selected_cart_items.get(0));
                    
                
            }else {
                showToast(com.tallty.smart_life_android.fragment.cart.ConfirmOrderFragment.EMPTY_ADDRESS);
            }
            break;
    }
}