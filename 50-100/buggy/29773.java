@java.lang.Override
public void push(E recibido) {
    if ((data.length) == (size)) {
        E[] arreglo_nuevo = ((E[]) (new java.lang.Object[(size) + ((size) * 2)]));
        int contador = 0;
        for (E indice : data) {
            arreglo_nuevo[contador] = indice;
            contador++;
        }
        data = arreglo_nuevo;
    }else {
        data[size] = recibido;
        (size)++;
    }
}