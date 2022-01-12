public void onCorrectionTrigger() {
    int currentSelected = getLightSelected();
    if (currentSelected != 0) {
        restorePreviousState();
        selectedLights.remove(lastLightAdded);
        lightUnit.alertLight(currentSelected);
        selectedLights.add(currentSelected);
        lastLightAdded = currentSelected;
    }else {
        java.lang.System.out.println("no light selected");
    }
}