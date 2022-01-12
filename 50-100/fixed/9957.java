public void updateSystemCount() throws java.lang.NumberFormatException {
    numSystems = java.lang.Math.abs(java.lang.Integer.parseInt(_FormattedTF_NumSystems.getText()));
    if ((numSystems) > 60) {
        numSystems = 60;
        _FormattedTF_NumSystems.setValue(new java.lang.Integer("60"));
    }else
        if ((numSystems) <= 0) {
            numSystems = 0;
            _FormattedTF_NumSystems.setValue(new java.lang.Integer("0"));
        }
    
    cs.getRackIndex(_ComboBox_Racks.getSelectedIndex()).getSuctionGroupIndex(_ComboBox_SuctionGroups.getSelectedIndex()).setNumSystems(numSystems);
}