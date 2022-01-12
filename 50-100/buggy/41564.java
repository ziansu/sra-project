public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((radiobuttonChan1.isSelected()) == false) {
        try {
            c.sendCommand("CONN 1");
        } catch (java.io.IOException e1) {
            e1.printStackTrace();
        }
    }else {
        try {
            c.sendCommand("DISC 1");
        } catch (java.io.IOException e1) {
            e1.printStackTrace();
        }
    }
    if ((c.connected[0][0]) == null) {
        radiobuttonChan1.setSelected(false);
    }
}