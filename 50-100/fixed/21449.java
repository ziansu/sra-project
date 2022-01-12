public void actionPerformed(java.awt.event.ActionEvent arg0) {
    app.views.ruben.Calcul ca = new app.views.ruben.Calcul();
    app.views.ruben.Chart am = new app.views.ruben.Chart(ca);
    app.views.ruben.LineChart lc = new app.views.ruben.LineChart(ca, "Restant à payer selon les trimestres", "Restant à payer selon les trimestres", ca.data);
    pane.removeAll();
    paneLeft.add(am);
    paneRight.add(lc);
    pane.revalidate();
    pane.repaint();
}