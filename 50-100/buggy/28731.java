@java.lang.Override
public void modifyText(org.eclipse.swt.events.ModifyEvent arg0) {
    yDimension = java.lang.Integer.parseInt(yDimensionSpinner.getText());
    yFlag = true;
    if ((((((genFlag) && (solveFlag)) && (xFlag)) && (yFlag)) && (zFlag)) && (textFlag))
        startGameButton.setEnabled(true);
    
}