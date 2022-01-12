private void handleAction(javafx.event.ActionEvent event) {
    if ((event.getSource()) instanceof javafx.scene.control.MenuItem) {
        final javafx.scene.control.MenuItem source = ((javafx.scene.control.MenuItem) (event.getSource()));
        buttonRespond(source.getText());
    }else
        if ((event.getSource()) instanceof javafx.scene.control.SplitMenuButton) {
            final javafx.scene.control.SplitMenuButton source = ((javafx.scene.control.SplitMenuButton) (event.getSource()));
            buttonRespond(source.getText());
        }
    
}