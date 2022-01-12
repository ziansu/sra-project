public java.util.ArrayList<controller.ControllerCarro> getCarros() {
    java.util.ArrayList<controller.ControllerCarro> aux = new java.util.ArrayList<>();
    for (int i = 0; i < (this.counter); i++) {
        if (aux != null) {
            aux.add(this.carros.get(i));
        }
    }
    return aux;
}