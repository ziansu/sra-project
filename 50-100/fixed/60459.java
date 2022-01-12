@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.shop_cart_modify_tv :
            {
                setCartMode();
                break;
            }
        case R.id.shop_cart_login_btn :
            {
                android.content.Intent intent = new android.content.Intent(this, com.plmt.boommall.ui.activity.LoginActivity.class);
                intent.setAction(LoginActivity.ORIGIN_FROM_CART_KEY);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
                break;
            }
        default :
            break;
    }
}