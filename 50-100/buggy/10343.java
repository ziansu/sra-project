public int getInt() {
    try {
        int r = java.lang.Integer.parseInt(in.readLine());
        return r;
    } catch (java.lang.NumberFormatException | java.io.IOException e) {
        java.lang.System.out.println(("No response from client with Snake ID of " + (snake.getId())));
        java.lang.System.out.println(((MainServer.currentSnakeManagerInstance.getClients().size()) + " snakes remaining"));
        isLive = false;
        closeConnection();
        snakeManager.getClients().remove(this);
    }
    return -1;
}