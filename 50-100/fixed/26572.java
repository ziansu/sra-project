public void menuFinal() {
    Truco.InputProvider input = new Truco.InputProvider();
    java.lang.Integer num1;
    java.lang.Integer num2;
    do {
        java.lang.System.out.println("Desea seguir jugando: ");
        java.lang.System.out.println("1) Si");
        java.lang.System.out.println("2) No");
        num1 = input.getIntegerInput();
    } while (!(input.controladorInput(num1, 1, 2)) );
    if (num1.equals(1)) {
        Truco.Juego.setFin(false);
    }
    if (num1.equals(2)) {
        Truco.Juego.setFin(true);
    }
}