public int[] invertida() {
    for (int i = (this.lista.length) - 1; i >= 0; i--) {
        this.lista[(((this.lista.length) - i) - 1)] = ((int) (i));
    }
    return this.lista;
}