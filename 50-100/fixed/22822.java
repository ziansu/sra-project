protected void setSteps(java.lang.String[] steps, java.lang.String[] stepsSubtitles, java.lang.String[] stepsButtonTexts) {
    this.steps = new java.util.ArrayList<>(java.util.Arrays.asList(steps));
    this.stepsButtonTexts = new java.util.ArrayList<>(java.util.Arrays.asList(stepsButtonTexts));
    if (stepsSubtitles != null) {
        this.stepsSubtitles = new java.util.ArrayList<>(java.util.Arrays.asList(stepsSubtitles));
    }else {
        this.stepsSubtitles = null;
    }
    numberOfSteps = steps.length;
    setAuxVars();
}