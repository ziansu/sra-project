public boolean updateModel() {
    int numVar = 0;
    for (int i = 0; i < (inputs.Input.VARIABLES.length); i++) {
        if ((variables.get(inputs.Input.VARIABLES[i])) != 0) {
            numVar++;
        }
    }
    if (numVar > 1) {
        this.numberFields = numVar;
        this.updateInputPanel(true);
        this.updateWantedFieldPanel();
        return true;
    }
    return false;
}