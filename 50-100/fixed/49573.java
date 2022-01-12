public void calcularAngulo(float ptFuturoX, float ptFuturoY) {
    this.anguloCalculado = ((float) (java.lang.Math.atan2((ptFuturoY - (this.corredor.getPosition().y)), (ptFuturoX - (this.corredor.getPosition().x))))) * (com.badlogic.gdx.math.MathUtils.radiansToDegrees);
    this.anguloCalculado = java.lang.Math.round(this.anguloCalculado);
    this.contadorAngulo = this.corredor.getAngle();
}