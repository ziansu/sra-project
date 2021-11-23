private void mouseMove(coders.Message message) {
    javax.json.JsonObject obj = ((javax.json.JsonObject) (message.getData()));
    int x = obj.getInt("x");
    int y = obj.getInt("y");
    robot.mouseMove(x, y);
}