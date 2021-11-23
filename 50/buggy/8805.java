public static robokill.GamePanel getGamePanel() {
    if ((robokill.GamePanel.This) == null) {
        java.lang.System.out.println(0);
        robokill.GamePanel.This = new robokill.GamePanel();
    }
    return robokill.GamePanel.This;
}