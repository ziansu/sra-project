@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.util.List<com.example.olga.shop.models.CartItem> cartItems = getCartItems(cart);
    cart.remove(cartItems.get(position).getProduct());
    cartItems.remove(position);
    cartItemAdapter.updateCartItems(cartItems);
    cartItemAdapter.notifyDataSetChanged();
    tvTotalPrice.setText(((com.example.olga.shop.constant.Constant.CURRENCY) + (java.lang.String.valueOf(cart.getTotalPrice().setScale(2, java.math.BigDecimal.ROUND_HALF_UP)))));
}