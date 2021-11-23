protected void setUpSteps() {
    stepLayouts = new java.util.ArrayList<>();
    for (int i = 0; i < (numberOfSteps); i++) {
        setUpStep(i);
    }
    setUpStep(numberOfSteps);
}