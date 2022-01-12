private void crearTablero(int total) {
    int i = 2;
    boolean encontrado = false;
    while ((i <= 9) && (!encontrado)) {
        if (((total / 2) % i) == 0) {
            tablero = new CartasIguales.Tablero(i, i);
            encontrado = true;
            this.getContentPane().add(tablero, java.awt.BorderLayout.NORTH);
        }
        i++;
    } 
}