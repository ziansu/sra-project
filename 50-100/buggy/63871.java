@java.lang.Override
public void modifyText(org.eclipse.swt.events.ModifyEvent arg0) {
    mazeNameToPlay = mazeNameTextBox.getText();
    textFlag = true;
    if ((((((genFlag) && (solveFlag)) && (xFlag)) && (yFlag)) && (zFlag)) && (textFlag))
        startGameButton.setEnabled(true);
    
}