public void eliminarPieza(piezas.Pieza pieza) {
    int n = 0;
    while ((n < (nPiezas)) && ((piezas[n]) != pieza))
        n++;
    
    if (n == (nPiezas))
        java.lang.System.err.println("HUBO UN ERROR, PIEZA NO ESTA EN LA MANO DE ESTE JUGADOR");
    else {
        for (int i = n; i < ((nPiezas) - 1); i++) {
            piezas[i] = piezas[(i + 1)];
        }
        java.lang.System.out.println("pieza eliminada");
        (nPiezas)--;
    }
}