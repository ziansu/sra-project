public static void main(java.lang.String[] args) {
    if (controller.Main.playTutorial) {
        controller.Main.c.startTutorial();
    }else {
        controller.Main.c.wTimer.start();
    }
    controller.Main.v.setLayout(null);
    controller.Main.v.getJPanel().addMouseListener(controller.Main.c);
}