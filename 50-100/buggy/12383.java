@javafx.fxml.FXML
private void dead() {
    this.pedroText.setText("c\u00ea morreu (t\u00e1 na vdd tu n morreu)\n(s\u00f3 perdeu todas as horas e o jogo)");
    this.alunoText.setText("COMER BIFE DE F\u00ccGADO \n (aquela coisa mata de t\u00e3o ruim) mova o mouse");
    this.dormirB.setDisable(true);
    this.estudarB.setDisable(true);
    this.dadinhoB.setDisable(true);
    this.next.setDisable(true);
    this.bg.setOnMouseMoved(( e) -> {
        java.lang.System.exit(0);
    });
}