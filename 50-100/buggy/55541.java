public void addRobot(final org.jointheleague.graphical.robot.Robot r) {
    javax.swing.SwingUtilities.invokeLater(new java.lang.Runnable() {
        public void run() {
            robotList.add(r);
        }
    });
    if ((ticker) == null) {
        ticker = new javax.swing.Timer((1000 / 30), r);
        ticker.start();
    }else {
        ticker.addActionListener(r);
    }
}