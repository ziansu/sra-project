public void setSpinnerChoice(com.MagikSquirrel.backgammon.gameBoard gameBoard, int iChoice) {
    android.widget.ArrayAdapter aChoices = ((android.widget.ArrayAdapter) (_sSrcPoint.getAdapter()));
    int iPosition = aChoices.getPosition(java.lang.Integer.toString(iChoice));
    _sSrcPoint.setSelection(iPosition);
}