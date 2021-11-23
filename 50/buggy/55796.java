public void brake() {
    try {
        out.writeUTF("");
        window.changeCommandText("Bremsen");
    } catch (java.io.IOException e) {
        java.lang.System.out.println("Fehler beim Senden des Befehls");
    }
}