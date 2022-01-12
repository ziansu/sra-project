private static int obtenerIntervaloEntreArribos() {
    double random = simulacion.Main.random();
    double result = simulacion.Main.MAX;
    while (result > 36) {
        result = 13 / (java.lang.Math.sqrt((1 - random)));
    } 
    return ((int) (java.lang.Math.round(result)));
}