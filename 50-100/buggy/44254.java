public int[] cargarLista(int opc) {
    java.util.Scanner input = new java.util.Scanner(java.lang.System.in);
    generador.generador gen = new generador.generador(this.lista_tamano);
    switch (opc) {
        case 1 :
            return gen.semiordenada();
        case 2 :
            return gen.desordenada();
        case 3 :
            return gen.invertida();
        default :
            cargarLista(1);
            break;
    }
    return null;
}