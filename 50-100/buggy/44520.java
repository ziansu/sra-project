public void setExercise(int exerciseId, java.lang.String exerciseName, int dateRange) {
    if ((exerciseSelector.getVisibility()) == (VISIBLE))
        exerciseSelector.setText(exerciseName);
    
    this.exerciseId = exerciseId;
    this.exerciseName = exerciseName;
    exerciseIsSet = true;
    currentRangePosition = newRangePosition = dateRange;
    slider.setPosition(currentRangePosition);
    update(true);
}