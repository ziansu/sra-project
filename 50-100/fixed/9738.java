private void btTestarMouseReleased(java.awt.event.MouseEvent evt) {
    if ("".equals(tfSite.getText())) {
        Pingador.Shell.atualizaOutput(Pingador.ft1.taOutput, "Alvo invalido");
        return ;
    }
    if ((java.lang.Integer.parseInt(spQtPack.getValue().toString())) < 3) {
        Pingador.ft1.ESTADO.setc(3);
    }
    ftcn();
}