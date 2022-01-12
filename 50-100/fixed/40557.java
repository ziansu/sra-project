private enty.Estructura compruebaEstructura(int id) {
    enty.Estructura estructura = null;
    enty.Estructura aux;
    java.util.Iterator it = estructuras.iterator();
    while (it.hasNext()) {
        aux = ((enty.Estructura) (it.next()));
        if (getDatos(id).contains(aux.getEstructura())) {
            estructura = aux;
        }
    } 
    return estructura;
}