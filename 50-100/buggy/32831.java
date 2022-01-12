public void actionPerformed(java.awt.event.ActionEvent arg0) {
    dk.gruppe5.model.Values_cam.setCanTres2(1000);
    frame.removeAll();
    frame.validate();
    frame.setVisible(false);
    dk.gruppe5.model.Values_cam.setCanTres1(50);
    dk.gruppe5.model.Values_cam.setCanTres2(100);
    dk.gruppe5.model.Values_cam.setCanAp(3);
    dk.gruppe5.model.Values_cam.setCorn(500);
    dk.gruppe5.model.Values_cam.setQual(0.1);
    dk.gruppe5.model.Values_cam.setDist(10);
    dk.gruppe5.model.Values_cam.setMethod(4);
    dk.gruppe5.model.Values_cam.setCirclePrecision(0.2);
    dk.gruppe5.test.WebcamTest.main(null);
}