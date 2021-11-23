@swagger.SwaggerUtils.ApiAction
public play.mvc.Result placeOrder() throws java.lang.Exception {
    com.fasterxml.jackson.databind.JsonNode nodebody = request().body().asJson();
    apimodels.Order body;
    body = mapper.readValue(nodebody.toString(), apimodels.Order.class);
    body.validate();
    apimodels.Order obj = imp.placeOrder(body);
    obj.validate();
    com.fasterxml.jackson.databind.JsonNode result = mapper.valueToTree(obj);
    return ok(result);
}