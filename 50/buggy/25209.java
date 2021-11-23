private static void apostar() {
    pokernetwork.Servidor.juego.getFase().apostar(pokernetwork.Servidor.juego);
    if (pokernetwork.Servidor.juego.terminarTurno()) {
        pokernetwork.Servidor.cambioFase(pokernetwork.Servidor.juego);
    }else
        java.lang.System.out.println("Un Jugador ha intentado apostar cuando no debia.");
    
}