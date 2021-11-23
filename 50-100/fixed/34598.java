@java.lang.Override
public void onRestoreInstanceState(android.os.Parcelable state) {
    if (state instanceof com.rd.PositionSavedState) {
        com.rd.PositionSavedState positionSavedState = ((com.rd.PositionSavedState) (state));
        this.selectedPosition = positionSavedState.getSelectedPosition();
        this.selectingPosition = positionSavedState.getSelectingPosition();
        this.lastSelectedPosition = positionSavedState.getLastSelectedPosition();
        super.onRestoreInstanceState(positionSavedState.getSuperState());
    }else {
        super.onRestoreInstanceState(state);
    }
}