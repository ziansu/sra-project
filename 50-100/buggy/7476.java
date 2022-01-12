private void displayNumberOfProcessedLearningContents(java.util.Map<de.saschafeldmann.adesso.master.thesis.elearningimport.model.LearningContent, java.util.List<de.saschafeldmann.adesso.master.thesis.detection.model.api.Concept>> learningContents) {
    setFinishedLabel();
    finishedLabel.setCaption(((((finishedLabel.getCaption()) + " (") + (learningContents.size())) + ")"));
    reset();
}