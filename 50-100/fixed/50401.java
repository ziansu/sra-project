@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (controller.Simulation.isStarted()) {
        controller.Simulation.reset();
        updateButtonState();
        java.lang.System.out.println(controller.Simulation.isStarted());
        java.lang.System.out.println(controller.Simulation.isPaused());
    }else {
        controller.Simulation.start();
        updateButtonState();
        controller.Simulation.Simulate();
    }
}