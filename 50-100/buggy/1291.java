@java.lang.Override
public void eliminar(java.lang.String clave) {
    implementaciones.DiccionarioMultiple.NodoDic aux = priClave;
    if (aux.clave.equals(clave)) {
        aux = aux.sig;
        priClave = aux;
    }else {
        while (!(aux.sig.clave.equals(clave))) {
            aux = aux.sig;
        } 
        aux.sig = aux.sig.sig;
    }
}