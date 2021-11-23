private void initRemainingPointsChanger() {
    final javafx.beans.value.ChangeListener<? super java.lang.Number> updater = ( observable, old, value) -> {
        final int spend = (this.strengthValue()) + (this.defenceValue());
        this.pointsToSpend.setText(java.lang.String.valueOf(((com.tbawor.jrogal.ui.creator.PlayerCreator.POINTS_TO_SPEND) - spend)));
    };
    this.strengthSlider.valueProperty().addListener(updater);
    this.defenceSlider.valueProperty().addListener(updater);
}