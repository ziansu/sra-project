public static void main(java.lang.String[] args) {
    com.equinox.SignalHandler.printSignal(new com.equinox.Signal(Signal.WELCOME_SIGNAL, true));
    java.lang.String input = com.equinox.Zeitgeist.scn.nextLine();
    while (true) {
        com.equinox.Signal signal = com.equinox.Zeitgeist.handleInput(input);
        com.equinox.SignalHandler.printSignal(signal);
        input = com.equinox.Zeitgeist.scn.nextLine();
    } 
}