@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((!(videoOn)) && (!(objectDetect)))
        return ;
    
    if ((altitudeField.getText().equals("")) || (radiusField.getText().equals("")))
        return ;
    
    setFlightParams();
    dispose();
    com.capstone.groundstation.ControlPage controlPage = new com.capstone.groundstation.ControlPage(videoOn, objectDetect);
    controlPage.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
    controlPage.setVisible(true);
}