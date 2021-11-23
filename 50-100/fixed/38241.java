private static long obtenerTAComplejidadBaja() {
    long result = simulacion.Main.MAX;
    while ((result < 10) || (result > 30)) {
        double r = simulacion.Main.random();
        result = ((long) ((java.lang.Math.log((1 - r))) / (-0.05)));
    } 
    return result;
}