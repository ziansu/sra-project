public static void main(java.lang.String[] args) {
    long time_start = java.lang.System.currentTimeMillis();
    greedy.Greedy10.cargarDatos();
    greedy.Greedy10.resolverProblema();
    greedy.Greedy10.mostrarMochila();
    long time_end = java.lang.System.currentTimeMillis();
    java.lang.System.out.println();
    java.lang.System.out.println("-------------------------------------------------------");
    java.lang.System.out.println();
    java.lang.System.out.println();
    java.lang.System.out.println(((">> Tiempo de duracion del proceso: " + (time_end - time_start)) + " milisegundos."));
}