public void atacar(videojuegos.pec1.Personaje per2) {
    int cantidad = 0;
    if ((this.getArma().estaDisponible()) == true) {
        cantidad = cantidad + (this.getArma().getDanyo());
    }
    if ((this.getDestreza()) > 0) {
        cantidad = cantidad + (this.getDestreza());
    }
    per2.setPv(((per2.getPv()) - cantidad));
}