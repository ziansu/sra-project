public void brake() {
    try {
        out.writeUTF("");
    } catch (java.io.IOException e) {
        java.lang.System.out.println("Fehler beim Senden des Befehls");
    }
}