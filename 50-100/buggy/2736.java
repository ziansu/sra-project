public void actionPerformed(java.awt.event.ActionEvent e) {
    javax.swing.JButton butt = new javax.swing.JButton("Prova");
    int color = util.window.ColorDialog.customize(butt);
    int oldcolor = java.lang.Integer.parseInt(AnimeIndex.colorProp.getProperty("Button_color"));
    if ((color != 0) && (color != oldcolor)) {
        btnBottoni.setBackground(new java.awt.Color(color));
        AnimeIndex.colorProp.setProperty("Button_color", java.lang.Integer.toString(color));
        util.window.ColorDialog.changed = true;
    }
}