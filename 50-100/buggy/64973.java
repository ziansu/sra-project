public void ajastinjuttu5() {
    ajastin4 = new javax.swing.Timer(5000, new java.awt.event.ActionListener() {
        @java.lang.Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            paivitanumero5();
            ajastinjuttu4();
            (Auto2)--;
            jLabel26.setText(java.lang.Integer.toString(Auto2));
            if ((laskuri4) == (auto)) {
                Auto2 = 0;
                jToggleButton3.doClick();
                ajastin4.stop();
            }
        }
    });
    ajastin4.setInitialDelay(1000);
    ajastin4.start();
}