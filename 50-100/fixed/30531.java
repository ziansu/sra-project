public java.lang.Integer menuInicial() {
    Truco.InputProvider input = new Truco.InputProvider();
    java.lang.Integer num;
    java.lang.System.out.println("Vamos a jugar al truco");
    do {
        java.lang.System.out.println("Elija cantidad de jugadores: ");
        java.lang.System.out.println("1) 2 Jugadores");
        java.lang.System.out.println("2) 4 Jugadores");
        num = input.getIntegerInput();
    } while (!(input.controladorInput(num, 1, 2)) );
    return num;
}