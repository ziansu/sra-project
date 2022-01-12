public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
    javax.swing.AbstractButton abstractButton = ((javax.swing.AbstractButton) (actionEvent.getSource()));
    searchBackwards = abstractButton.getModel().isSelected();
    if (((searchBackwards) && ((edu.rutgers.MOST.presentation.PathwaysFrame.getFindLocationsMap()) != null)) && ((edu.rutgers.MOST.presentation.PathwaysFrame.getFindLocationsMap().size()) > 0)) {
        findStartIndex = (edu.rutgers.MOST.presentation.PathwaysFrame.getFindLocationsMap().size()) - 1;
    }else {
        findStartIndex = 0;
    }
}