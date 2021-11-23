private void jBtnResetActionPerformed(java.awt.event.ActionEvent evt) {
    Interfaces.RealEstate.list.reset();
    house = ((Interfaces.ListHouse) (Interfaces.RealEstate.list.getNextItem()));
    showHouse(house);
}