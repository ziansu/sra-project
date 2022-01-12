@java.lang.Override
public void onItemClick(android.view.View childView, int position) {
    java.lang.String price = java.text.NumberFormat.getCurrencyInstance(new java.util.Locale("vi", "VN")).format((position > 0 ? position * 15000 : 15000));
    android.widget.TextView tvPrice = ((android.widget.TextView) (getView().findViewById(R.id.tvPrice)));
    tvPrice.setText(price);
}