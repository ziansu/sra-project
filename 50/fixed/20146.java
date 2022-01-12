private void saveExercise() {
    com.xelit3.gymstatus.model.dto.CardioExercise tmpCardioExercise = new com.xelit3.gymstatus.model.dto.CardioExercise();
    tmpCardioExercise.setExerciseName(this.tfExerciseName.getText());
    mainController.saveExercise(tmpCardioExercise);
    this.updateUI();
}