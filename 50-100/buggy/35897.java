@java.lang.Override
public java.util.Map<java.lang.String, java.lang.Object> handle(io.core9.plugin.server.request.Request req) {
    java.util.Map<java.lang.String, java.lang.Object> result = new java.util.HashMap<java.lang.String, java.lang.Object>(2);
    io.core9.commerce.checkout.Order order = helper.getRawOrder(req);
    if (order != null) {
        result.put("paymentData", io.core9.plugin.database.repository.DataUtils.toMap(order));
    }
    return result;
}