private boolean piezaYaDividida(ar.com.textillevel.modulos.odt.entidades.PiezaODT elemento) {
    for (ar.com.textillevel.modulos.odt.entidades.PiezaODT pODT : odt.getPiezas()) {
        if (((((pODT.getOrden()) != null) && ((elemento.getOrden()) != null)) && (pODT.getOrden().equals(elemento.getOrden()))) && ((pODT.getOrdenSubpieza()) != null)) {
            return true;
        }
    }
    return false;
}