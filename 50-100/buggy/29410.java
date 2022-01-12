public void setLabel(java.lang.String label) {
    if ((curWidgetAI) instanceof pneumaticCraft.common.ai.DroneAIExternalProgram) {
        label = ((((pneumaticCraft.common.ai.DroneAIExternalProgram) (curWidgetAI)).getRunningAI().getLabel()) + " --> ") + label;
    }
    currentLabel = label;
    drone.setLabel(label);
}