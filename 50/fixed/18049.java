protected void morir() {
    if ((this.servidor) != null) {
        this.servidor.eliminarHiloConexion(this);
    }
    this.servidor = null;
    try {
        this.finalize();
    } catch (java.lang.Throwable e) {
    }
}