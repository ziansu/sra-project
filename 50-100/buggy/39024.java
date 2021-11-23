public void zeigeLaufendeAuslieferung(int restMenge) {
    this.removeAll();
    this.add(undo);
    this.addSeparator(new java.awt.Dimension(10, 0));
    laufendeAuslieferung.setText((("<html>Es gibt eine laufende Auslieferung <br>" + restMenge) + " Einheiten wurden schon verteilt</html>"));
    this.add(laufendeAuslieferung);
    this.add(buchungVerwerfen);
    if (restMenge > 0) {
        this.add(buchungAbschliessen);
    }
    this.add(redo);
    this.revalidate();
    this.repaint();
}