@javafx.fxml.FXML
private void runAll() {
    if ((circuit.getX()) != null) {
        int step = circuit.getCurrentStep();
        int numOfSteps = circuit.getNumberOfOperators();
        if (step != numOfSteps) {
            for (int i = step; i < numOfSteps; i++) {
                circuit.getOperator(i).doOperation();
            }
            circuit.setCurrentStep(numOfSteps);
            canvasManager.stepThrough(numOfSteps);
        }
    }
}