private void perdeVida() {
    if (((vida) - 10) < 0) {
        this.vida = 0;
        status = status.MORTO;
    }else {
        this.vida -= 10;
        if ((vida) <= 0) {
            status = status.MORTO;
        }
    }
}