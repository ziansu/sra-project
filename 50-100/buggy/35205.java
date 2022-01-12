@javafx.fxml.FXML
void onSliderClick() {
    proceed = true;
    slider.setValue(java.lang.Math.round(slider.getValue()));
    int currentSliderValue = ((int) (slider.getValue()));
    int tempPreviousSliderValue = previousSliderValue;
    if (currentSliderValue > tempPreviousSliderValue) {
        step((currentSliderValue - (currentStep)));
    }else
        if (currentSliderValue < tempPreviousSliderValue) {
            stepBack((((currentStep) + 1) - currentSliderValue));
            step(1);
        }
    
    previousSliderValue = currentSliderValue;
}