public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((radioButtonChan4.isSelected()) == true) {
        try {
            c.sendCommand("CONN 4");
        } catch (java.io.IOException e1) {
            e1.printStackTrace();
        }
    }else {
        try {
            c.sendCommand("DISC 4");
        } catch (java.io.IOException e1) {
            e1.printStackTrace();
        }
    }
    if ((c.connected[1][1]) == null) {
        radioButtonChan7.setSelected(false);
    }
}