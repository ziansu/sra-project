public void dispose() {
    this.gradleConsole.getProcessDescription().get().getJob().removeJobChangeListener(this);
}