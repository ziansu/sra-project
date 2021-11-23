public void createNewGame() {
    java.lang.System.out.println("Opening character creation view");
    gameWindow.setContentPane(new com.oop1.view.CharacterCreationView(this));
    gameWindow.pack();
    gameWindow.setMinimumSize(new java.awt.Dimension(1350, 574));
}