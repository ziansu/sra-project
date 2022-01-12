public void forward(com.fifty50.computer.Main.Speed speed) {
    java.lang.String command;
    switch (speed) {
        case FAST :
        default :
            command = "I";
            break;
        case SLOW :
            command = "W";
            break;
    }
    try {
        out.writeUTF(command);
        window.changeCommandText(("Befehl: " + command));
    } catch (java.io.IOException e) {
        java.lang.System.out.println(("Fehler beim Senden des Befehls " + command));
    }
}