public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((radioButtonChan3.isSelected()) == true) {
        try {
            c.sendCommand("CONN 3");
        } catch (java.io.IOException e1) {
            e1.printStackTrace();
        }
    }else {
        try {
            c.sendCommand("DISC 3");
        } catch (java.io.IOException e1) {
            e1.printStackTrace();
        }
    }
    if ((c.connected[0][1]) == null) {
        radioButtonChan3.setSelected(false);
    }
}