public void genList() {
    java.util.Vector<java.lang.String> v = new java.util.Vector<java.lang.String>();
    for (int i = 0; i < (this.carnet.getListeFiches().size()); i++) {
        this.listeM.addElement(this.carnet.getFicheFromIndex(i));
    }
    this.repaint();
    java.lang.System.out.println((("Repainted " + (this.carnet.getListeFiches().size())) + " elements"));
}