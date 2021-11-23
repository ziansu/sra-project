private void continueToOutput() {
    boolean areStepsValid = true;
    for (java.util.Map.Entry<java.lang.Integer, com.hotspothealthcode.hotspothealthcode.Components.Steps.StepView> entry : this.steps.entrySet()) {
        if (!(entry.getValue().isValid())) {
            areStepsValid = false;
            break;
        }
    }
    if (areStepsValid) {
        createCalculationObject();
        hotspothealthcode.controllers.Controller.setCalcConcentration(this.calcConcentration);
        android.content.Intent outpotActivityIntent = new android.content.Intent(getApplicationContext(), com.hotspothealthcode.hotspothealthcode.OutputActivity.class);
        startActivity(outpotActivityIntent);
    }
}