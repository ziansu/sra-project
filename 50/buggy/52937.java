@io.swagger.client.api.GET(value = "store/order/{orderId}")
retrofit2.Call<io.swagger.client.model.Order> getOrderById(@io.swagger.client.api.Path(value = "orderId")
java.lang.Long orderId);