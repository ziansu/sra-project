@java.lang.Override
public void handle(org.vertx.java.core.json.JsonObject event) {
    logger.info(("Completed Delete Event: " + event));
    unRegisterHandler(getMandatoryString("id", message));
    message.reply(event);
}