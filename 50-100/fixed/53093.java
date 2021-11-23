private java.lang.String getName(int id, java.lang.String col) {
    java.lang.String name = javax.swing.JOptionPane.showInputDialog(null, (((("Wie soll Spieler Nr. " + (id + 1)) + " mit der Farbe ") + col) + " heißen?"));
    if (name == null) {
        name = "";
    }
    return name;
}