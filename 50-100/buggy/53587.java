public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((radioButtonChan2.isSelected()) == false) {
        try {
            c.sendCommand("CONN 2");
        } catch (java.io.IOException e1) {
            e1.printStackTrace();
        }
    }else {
        try {
            c.sendCommand("DISC 2");
        } catch (java.io.IOException e1) {
            e1.printStackTrace();
        }
    }
    if ((c.connected[1][0]) == null) {
        radioButtonChan7.setSelected(false);
    }
}