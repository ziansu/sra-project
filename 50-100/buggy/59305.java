private void updateProgressBar() {
    for (com.team_clicker.idlefarmer.view.CerealView cerealView : cerealsView) {
        if ((cerealView.getCereal().getLevel()) > 0) {
            cerealView.getProgressBar().setProgress(((cerealView.getProgressBar().getProgress()) + 1));
        }
        if ((cerealView.getProgressBar().getProgress()) == (cerealView.getProgressBar().getMax())) {
            cerealView.getProgressBar().setProgress(0);
        }
    }
}