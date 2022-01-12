public void menuRespuestaTruco() {
    Truco.InputProvider input = new Truco.InputProvider();
    java.lang.Integer num1;
    do {
        java.lang.System.out.println("El oponente canto truco: ");
        java.lang.System.out.println("1) Quiero");
        java.lang.System.out.println("2) No quiero");
        java.lang.System.out.println("3) Quiero retruco");
        num1 = input.getIntegerInput();
    } while (input.controladorInput(num1, 1, 3) );
}