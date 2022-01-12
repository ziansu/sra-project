@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((dt) == 0) {
        dt = engine.CustomOptionMenu.doubleInput("Enter dt.");
    }
    if ((dt) != 0) {
        try {
            save.doClick();
            thread.start();
            java.lang.System.out.println("started");
        } catch (java.lang.Exception ex) {
        }
        paused = false;
    }
}