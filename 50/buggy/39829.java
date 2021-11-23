public static void getClientOrders(int page, android.content.Context context, retrofit.Callback<java.util.List<com.getataxi.mobiletaxi.comm.models.OrderDM>> callback) {
    com.getataxi.mobiletaxi.comm.RestClientManager.client.getOrdersService(com.getataxi.mobiletaxi.comm.RestClientManager.getAuthorisationHeaders(context)).getOrdersPage(page, callback);
}