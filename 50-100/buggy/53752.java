@java.lang.Override
public TDA.ConjuntoTDA<clases.Libro> recuperar(java.lang.String clave) {
    TDA.ConjuntoTDA<clases.Libro> conjunto = new Implementaciones.Conjunto<clases.Libro>();
    conjunto.inicializarConjunto();
    implementaciones.DiccionarioMultiple.NodoDic aux = priClave;
    aux = buscarGenero(clave);
    implementaciones.DiccionarioMultiple.NodoV auxV = aux.valores;
    while (auxV != null) {
        conjunto.agregar(auxV.valor);
        auxV = auxV.sig;
    } 
    return conjunto;
}