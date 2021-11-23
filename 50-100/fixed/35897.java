@java.lang.Override
public java.util.Map<java.lang.String, java.lang.Object> handle(io.core9.plugin.server.request.Request req) {
    io.core9.commerce.checkout.Order order = helper.getRawOrder(req);
    if (order != null) {
        return io.core9.plugin.database.repository.DataUtils.toMap(order);
    }
    return new java.util.HashMap<java.lang.String, java.lang.Object>();
}