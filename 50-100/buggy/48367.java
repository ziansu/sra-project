private void mouseMove(coders.Message message) {
    javax.json.JsonObject json = dec.getJson(((java.lang.String) (message.getData())));
    int x = java.lang.Integer.valueOf(json.getString("x"));
    int y = java.lang.Integer.valueOf(json.getString("y"));
    robot.mouseMove(x, y);
}