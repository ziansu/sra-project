private android.app.PendingIntent getPastOrderPendingIntent(java.util.Map data) {
    android.content.Intent pastOrderIntent = new android.content.Intent(this, com.kosbrother.mongmongwoo.pastorders.PastOrderDetailActivity.class);
    pastOrderIntent.putExtra(PastOrderDetailActivity.EXTRA_INT_ORDER_ID, java.lang.Integer.parseInt(data.get("order_id").toString()));
    pastOrderIntent.putExtra(PastOrderDetailActivity.EXTRA_BOOLEAN_FROM_NOTIFICATION, true);
    return android.app.PendingIntent.getActivity(this, 0, pastOrderIntent, PendingIntent.FLAG_ONE_SHOT);
}