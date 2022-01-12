@java.lang.Override
public void eliminarValor(java.lang.String clave, clases.Libro valor) {
    implementaciones.DiccionarioMultiple.NodoDic aux = buscarGenero(clave);
    if (aux != null) {
        implementaciones.DiccionarioMultiple.NodoV auxV = aux.valores;
        if (auxV.valor.equals(valor)) {
            auxV = auxV.sig;
            aux.valores = auxV;
            if ((aux.valores) == null) {
                eliminar(aux.clave);
            }
        }else {
            while (!(auxV.sig.valor.equals(valor))) {
                auxV = auxV.sig;
            } 
            if (auxV != null) {
                auxV.sig = auxV.sig.sig;
            }
        }
    }
}