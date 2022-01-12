@java.lang.Override
public void run() {
    javafx.application.Platform.runLater(() -> {
        controller.updateSimulation(1);
        controls.update(OptionControls.SIMULATION_ANIMATION_PLAYING);
    });
    (numberOfWeeksAutoSimulated)++;
    animationActive = (animationActive) && ((numberOfWeeksAutoSimulated) < (io.github.paulszefer.gui.option.handler.PlayButtonHandler.MAX_WEEKS_TO_SIMULATE));
    if (!(animationActive)) {
        timer.cancel();
        numberOfWeeksAutoSimulated = 0;
        javafx.application.Platform.runLater(() -> {
            controls.update(OptionControls.SIMULATION_ANIMATION_STOPPED);
        });
    }
}