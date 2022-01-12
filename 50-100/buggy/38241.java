private static long obtenerTAComplejidadBaja() {
    double r = simulacion.Main.random();
    long result = simulacion.Main.MAX;
    while ((result < 10) && (result > 30)) {
        result = ((long) ((java.lang.Math.log((1 - r))) / (-0.05)));
    } 
    return ((long) ((30 * r) + 28));
}