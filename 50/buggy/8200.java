public void actionPerformed(java.awt.event.ActionEvent event) {
    if ((event.getActionCommand()) == "Hit") {
        control.hit();
    }
    if ((event.getActionCommand()) == "Stay") {
        control.stay();
    }
}