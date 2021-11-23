public void setup() {
    frame.add(view);
    frame.addKeyListener(controller);
    frame.setSize(width, height);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    controller.startGame();
}