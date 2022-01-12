public void waitAndSend(int dx, int dy) {
    new java.lang.Thread(() -> {
        waiting = true;
        try {
            java.lang.Thread.sleep(33);
            new InputReader.MouseMoveEvent(dx, dy).send();
            robot.mouseMove(((width) / 2), ((height) / 2));
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
        waiting = false;
    }).start();
}