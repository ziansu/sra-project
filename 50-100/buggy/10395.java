private void initializeCorps() {
    earth = new itba.ss.TP4_MarsTravel.Particle(0, 6371000.0, 1.391734353396533E11, (-5.71059040560652E10), 10801.963811159256, 27565.215006898346, 5.972E24);
    sun = new itba.ss.TP4_MarsTravel.Particle(1, 6.957E8, 0, 0, 0, 0, 1.988E30);
    mars = new itba.ss.TP4_MarsTravel.Particle(2, 6.957E8, 8.31483493435295E10, (-1.914579540822006E11), 23637.91232131405, 11429.021426712032, 6.4185E23);
    locateShip();
}