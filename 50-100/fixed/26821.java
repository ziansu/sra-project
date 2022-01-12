private void updateProgress() {
    java.lang.System.out.println(completedPhases);
    setProgress(completedPhases);
    firePropertyChange("progress", completedPhases, completedPhases);
    if ((jpb) != null) {
        jpb.setValue(completedPhases);
        jpb.setString(this.currentPhase);
    }
}