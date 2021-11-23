public void setup() {
    frame.add(view);
    controller.startGame();
    frame.addKeyListener(controller);
    frame.setSize(width, height);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
}