public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((radioButtonChan6.isSelected()) == false) {
        try {
            c.sendCommand("CONN 6");
        } catch (java.io.IOException e1) {
            e1.printStackTrace();
        }
    }else {
        try {
            c.sendCommand("DISC 6");
        } catch (java.io.IOException e1) {
            e1.printStackTrace();
        }
    }
    if ((c.connected[1][2]) == null) {
        radioButtonChan7.setSelected(false);
    }
}