@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    controller.Controller.v.getMenu().setAlwaysOnTop(false);
    controller.Controller.v.getMenu().dispose();
    startTutorial();
    controller.Controller.v.getMenu().dispose();
}