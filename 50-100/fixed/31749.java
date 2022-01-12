public joeflowsays.JoeFlowSays.JGamePanel getStartPanel() {
    joeflowsays.JoeFlowSays.JGamePanel sP = new joeflowsays.JoeFlowSays.JGamePanel("/Images/Look and Feel/backgroundMain.jpg");
    javax.swing.BoxLayout bl = new javax.swing.BoxLayout(sP, javax.swing.BoxLayout.Y_AXIS);
    sP.setLayout(bl);
    javax.swing.JButton startButt = new javax.swing.JButton();
    startButt.setName("Start");
    makeCustomButton(startButt, "/Images/Look and Feel/startButtonUnpressed.png", "/Images/Look and Feel/startButtonPressed.png");
    startButt.setAlignmentX(javax.swing.Box.CENTER_ALIGNMENT);
    startButt.addActionListener(PCListener);
    sP.add(javax.swing.Box.createVerticalStrut(550));
    sP.add(startButt);
    return sP;
}