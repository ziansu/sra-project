@java.lang.Override
public void modifyText(org.eclipse.swt.events.ModifyEvent arg0) {
    mazeNameToPlay = mazeNameTextBox.getText();
    if ((mazeNameToPlay) != null)
        textFlag = true;
    
    if ((((((genFlag) && (solveFlag)) && (xFlag)) && (yFlag)) && (zFlag)) && (textFlag))
        startGameButton.setEnabled(true);
    
}