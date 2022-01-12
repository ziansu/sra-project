public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((radioButtonChan5.isSelected()) == false) {
        try {
            c.sendCommand("CONN 5");
        } catch (java.io.IOException e1) {
            e1.printStackTrace();
        }
    }else {
        try {
            c.sendCommand("DISC 5");
        } catch (java.io.IOException e1) {
            e1.printStackTrace();
        }
    }
    if ((c.connected[0][2]) == null) {
        radioButtonChan5.setSelected(false);
    }
}