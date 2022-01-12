@java.lang.Override
public void update(com.flurnamenpuzzle.generator.ui.Observable observable) {
    com.flurnamenpuzzle.generator.ui.model.PuzzleGeneratorModel model = ((com.flurnamenpuzzle.generator.ui.model.PuzzleGeneratorModel) (observable));
    com.flurnamenpuzzle.generator.ui.Steps currentStep = model.getCurrentStep();
    java.lang.String currentStepId = currentStep.getId();
    java.lang.String imagePath = currentStep.getImagePath();
    this.steps.setIcon(new javax.swing.ImageIcon(this.getClass().getResource(imagePath)));
    cardLayout.show(cards, "resultPanel");
}