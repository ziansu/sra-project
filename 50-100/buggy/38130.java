private void creaFinestra() {
    java.util.ArrayList<java.lang.String> prova = listaFarmaci;
    frameP = new View.frameConfermaPrescrizione(medicoController.listaFarmaciSelezionati(jList2.getSelectedIndices(), listaFarmaci), jTextFieldPaziente.getText(), this, "visita");
    frameP.setVisible(true);
    frameP.setSize(600, 500);
}