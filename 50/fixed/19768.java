public void newDisplay() {
    try {
        display.makeQuestion();
    } catch (game.ZeroDenomException e) {
        java.lang.System.out.println(e.getMessage());
    }
}