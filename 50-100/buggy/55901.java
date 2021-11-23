@java.lang.Override
public void handle(io.vertx.core.eventbus.Message<io.vertx.core.json.JsonObject> event) {
    io.vertx.core.json.JsonObject json = event.body();
    java.lang.String room_id = json.getString("room_id");
    io.vertx.core.json.JsonObject data = json.getJsonObject("data");
    event.reply(event);
    eb.publish(("to.channel." + room_id), data.toString());
}