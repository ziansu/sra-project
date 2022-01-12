public int[] invertida() {
    for (int i = (this.lista.length) - 1; i >= 0; i--) {
        this.lista[i] = ((int) (i));
    }
    return this.lista;
}