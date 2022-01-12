@java.lang.Override
public android.os.Parcelable onSaveInstanceState() {
    com.rd.PositionSavedState positionSavedState = new com.rd.PositionSavedState(super.onSaveInstanceState());
    positionSavedState.setSelectedPosition(selectedPosition);
    positionSavedState.setSelectingPosition(selectingPosition);
    positionSavedState.setLastSelectedPosition(lastSelectedPosition);
    return positionSavedState;
}