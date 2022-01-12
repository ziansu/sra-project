public static play.mvc.Result displayMessage(java.lang.String message) {
    return ok(views.html.displayMessage.render(message));
}