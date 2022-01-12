private void jBtnAddTournamentActionPerformed() {
    testAddNewTournament();
    model.NewTournamentDialog ntd = new model.NewTournamentDialog(this);
    ntd.setLocationRelativeTo(null);
    ntd.setVisible(true);
    this.toFront();
    ntd.toFront();
}