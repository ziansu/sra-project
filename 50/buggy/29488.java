@controllers.BodyParser.Of(value = BodyParser.Json.class)
public static controllers.Result ajaxCall() {
    response().setContentType("text/javascript");
    controllers.ObjectNode response = controllers.Application.ajax.handle(request().body().asJson());
    return ok(response);
}