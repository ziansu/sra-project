@java.lang.Override
public void run() {
    while (true) {
        mainGamePanel.update();
        this.repaint();
        fruitGenerator.update();
        snake.update();
        if (controller.isStarted()) {
            snakeView.update();
            fruitGroupView.update();
            controller.applyRules(snake, fruitGenerator, snakeView, fruitGroupView);
        }
        try {
            java.lang.Thread.sleep(Constants.REFRESH_RATE);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}