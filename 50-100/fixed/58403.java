@javafx.fxml.FXML
public void listaUsuarios() {
    try {
        engsoft.Fxml.ProcurarCartas.engsoft.ControleUI.getInstance().setIdCartaBuf(java.lang.Integer.parseInt(CartaID.getText()));
    } catch (java.lang.Exception e) {
        engsoft.Fxml.ProcurarCartas.engsoft.ControleUI.getInstance().setIdCartaBuf(0);
    }
    engsoft.Fxml.ProcurarCartas.engsoft.ControleUI.getInstance().chamaListarUsuario();
}