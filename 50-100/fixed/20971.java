public static java.lang.String pedirOrden(java.awt.Color turno) {
    java.util.Scanner teclado = new java.util.Scanner(java.lang.System.in);
    if (turno.equals(java.awt.Color.white)) {
        java.lang.System.out.println("\nTurno de blancas.");
    }else {
        java.lang.System.out.println("\nTurno de negras.");
    }
    java.lang.System.out.print("Introduzca una orden: ");
    return teclado.nextLine();
}