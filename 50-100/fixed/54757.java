private static int obtenerIntervaloEntreArribos() {
    double result = simulacion.Main.MAX;
    while (result > 36) {
        double random = simulacion.Main.random();
        result = 13 / (java.lang.Math.sqrt((1 - random)));
    } 
    return ((int) (java.lang.Math.round(result)));
}