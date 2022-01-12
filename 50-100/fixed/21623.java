public static void main(java.lang.String[] args) {
    userInterface.MainGameFrame frame1 = new userInterface.MainGameFrame();
    frame1.setDefaultLookAndFeelDecorated(true);
    frame1.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    frame1.setSize(1000, 600);
    frame1.setLocationRelativeTo(null);
    frame1.setVisible(true);
    gameLogic.conditions listener1 = new gameLogic.conditions(frame1);
    frame1.getButton().addActionListener(listener1);
}