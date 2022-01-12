@java.lang.Override
public void modifyText(org.eclipse.swt.events.ModifyEvent arg0) {
    zDimension = java.lang.Integer.parseInt(zDimensionSpinner.getText());
    zFlag = true;
    if ((((((genFlag) && (solveFlag)) && (xFlag)) && (yFlag)) && (zFlag)) && (textFlag))
        startGameButton.setEnabled(true);
    
}