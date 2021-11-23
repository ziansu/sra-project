public void newDisplay() {
    try {
        display.makeQuestion();
        display.getProblem().repaint();
    } catch (game.ZeroDenomException e) {
        java.lang.System.out.println(e.getMessage());
    }
}