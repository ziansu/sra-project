@java.lang.Override
public void onSelectionDecreasePainted(int colEdgeIndex, int rowEdgeIndex) {
    spreadsheetHandler.selectionDecreasePainted(rowEdgeIndex, colEdgeIndex);
    startDelayedSendingTimer();
}