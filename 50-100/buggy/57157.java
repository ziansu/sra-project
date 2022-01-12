@javafx.fxml.FXML
public void onStepSpecify() {
    int specifiedStep = java.lang.Integer.valueOf(step_specifier.getText());
    if ((specifiedStep < 0) || (specifiedStep > (steps.size()))) {
        return ;
    }else
        if (specifiedStep < (currentStep)) {
            stepBack((((currentStep) + 1) - specifiedStep));
            step(1);
        }else
            if (specifiedStep > (currentStep)) {
                step((specifiedStep - (currentStep)));
            }
        
    
}