public void itemStateChanged(java.awt.event.ItemEvent e) {
    if (((e.getStateChange()) == (java.awt.event.ItemEvent.SELECTED)) && (!(((java.lang.String) (comboRefs.getSelectedItem())).equals("")))) {
        MainClass.masterControler.VRDCont.getDetailsFromList(((comboRefs.getSelectedIndex()) - 1));
    }else
        redDetails.setText("");
    
}