public static void main(java.lang.String[] args) {
    java.lang.System.out.println("UTOT MO JEZZA");
    userInterface.MainGameFrame frame1 = new userInterface.MainGameFrame();
    java.lang.System.out.println("Igi");
    frame1.setDefaultLookAndFeelDecorated(true);
    frame1.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    frame1.setSize(1000, 600);
    frame1.setLocationRelativeTo(null);
    frame1.setVisible(true);
    gameLogic.conditions listener1 = new gameLogic.conditions(frame1);
    frame1.getButton().addActionListener(listener1);
}