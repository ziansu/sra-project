public void itemStateChanged(java.awt.event.ItemEvent arg0) {
    if ((chkEnSnareA.isSelected()) || (chkEnSnareB.isSelected())) {
        if (!(cBoxPortSnare.isEnabled()))
            cBoxPortSnare.setEnabled(true);
        
    }else {
        cBoxPortSnare.removeAll();
        cBoxPortSnare.addItem("");
        cBoxPortSnare.setEnabled(false);
    }
}