public java.lang.String getLabel() {
    if ((curWidgetAI) instanceof pneumaticCraft.common.ai.DroneAIExternalProgram) {
        return ((((pneumaticCraft.common.ai.DroneAIExternalProgram) (curWidgetAI)).getRunningAI().getLabel()) + " --> ") + (currentLabel);
    }else {
        return currentLabel;
    }
}