@java.lang.Override
public java.util.Map getFilterParams() {
    android.content.Intent packageIntent = getIntent();
    map.put("bankId", packageIntent.getStringExtra("bankId"));
    map.put("orderId", packageIntent.getStringExtra("orderId"));
    return map;
}