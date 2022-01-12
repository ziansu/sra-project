public void normatizarComponentes() {
    this.corredor.setTransform(this.corredor.getPosition(), ((this.normatizador.normatizar(getAnguloCorredor_Graus())) * (com.badlogic.gdx.math.MathUtils.degreesToRadians)));
    this.anguloCalculado = this.normatizador.normatizar(this.anguloCalculado);
}