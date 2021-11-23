public static java.lang.String getRoutingKey() {
    return app.MainController.routingKeyField.getText().equals("") ? null : app.MainController.routingKeyField.getText();
}