public void itemStateChanged(java.awt.event.ItemEvent arg0) {
    if ((chkEnOHiHatA.isSelected()) || (chkEnOHiHatB.isSelected())) {
        if (!(cBoxPortOHiHat.isEnabled()))
            cBoxPortOHiHat.setEnabled(true);
        
    }else {
        cBoxPortOHiHat.removeAll();
        cBoxPortOHiHat.addItem("");
        cBoxPortOHiHat.setEnabled(false);
    }
}