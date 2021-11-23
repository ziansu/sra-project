public void menuRespuestaVale4() {
    Truco.InputProvider input = new Truco.InputProvider();
    java.lang.Integer num1;
    do {
        java.lang.System.out.println("El oponente canto vale 4: ");
        java.lang.System.out.println("1) Quiero");
        java.lang.System.out.println("2) No quiero");
        num1 = input.getIntegerInput();
    } while (input.controladorInput(num1, 1, 2) );
}