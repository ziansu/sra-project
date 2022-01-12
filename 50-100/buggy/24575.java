@java.lang.Override
public void handle(final javafx.event.ActionEvent e) {
    if ((logicFile) != null) {
        logicFile = null;
        discardLogic.setDisable(true);
        logicAdded = false;
        chosenLogic.setText("Chosen Logic-File: none");
        chosenLogic.setVisible(false);
        discardLogicItem.setDisable(true);
        if (browserChosen)
            statusText.setText("Waiting for Logic");
        else
            statusText.setText("Waiting for Input");
        
    }else
        discardLogic.setDisable(true);
    
}