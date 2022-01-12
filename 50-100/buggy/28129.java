@com.tw.tradeaway.controller.CrossOrigin(origins = "*")
@com.tw.tradeaway.controller.RequestMapping(value = "order", method = RequestMethod.POST, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public org.springframework.http.ResponseEntity<?> checkoutToPlaceOrder(@com.tw.tradeaway.controller.RequestBody
com.tw.tradeaway.dto.OrderItemDto orderItem) {
    if ((orderItem == null) || ((orderItem.ProductId) == 0)) {
        throw new java.lang.NullPointerException("Parameter Type [Order ID] cannot be null");
    }
    java.net.URI location = org.springframework.web.servlet.support.ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(orderItem.getProductId()).toUri();
    return org.springframework.http.ResponseEntity.created(location).build();
}