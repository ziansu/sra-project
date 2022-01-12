@java.lang.Override
public void handle(javafx.event.ActionEvent event) {
    java.lang.Integer numSteps = ((java.lang.Integer) (numStepsField.getValue()));
    for (int i = 0; i < numSteps; i++) {
        project5.Critter.worldTimeStep();
    }
    project5.Critter.displayWorld();
}