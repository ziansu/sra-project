@java.lang.Override
public void update(com.flurnamenpuzzle.generator.Observable observable) {
    com.flurnamenpuzzle.generator.domain.PuzzleGeneratorModel model = ((com.flurnamenpuzzle.generator.domain.PuzzleGeneratorModel) (observable));
    int percentage = model.getPercentageGenerated();
    java.lang.String statusMessage = model.getStatusMessage();
    if (statusMessage != null) {
        this.progressLabel.setText(statusMessage);
    }
    java.lang.System.out.println(statusMessage);
    this.progressBar.setValue(percentage);
    this.progressBar.setString(((progressBar.getValue()) + "%"));
}