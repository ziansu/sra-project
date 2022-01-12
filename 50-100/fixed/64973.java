public void ajastinjuttu5() {
    ajastin4 = new javax.swing.Timer(5000, new java.awt.event.ActionListener() {
        @java.lang.Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            paivitanumero5();
            ajastinjuttu4();
            if ((laskuri4) == (auto)) {
                Auto2 = 0;
                ajastin4.stop();
            }
        }
    });
    ajastin4.setInitialDelay(0);
    ajastin4.start();
}