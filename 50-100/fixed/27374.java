public void genList() {
    for (int i = 0; i < (this.carnet.getListeFiches().size()); i++) {
        this.listeM.addElement(this.carnet.getFicheFromIndex(i));
    }
    this.repaint();
}