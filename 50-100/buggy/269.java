@java.lang.Override
public void handle(javafx.event.ActionEvent event) {
    java.lang.String eingabe = consoleField.getText();
    aufgabenblatt4.Punkt punkt;
    try {
        punkt = new aufgabenblatt4.Punkt(polySkript.getX(eingabe), polySkript.getY(eingabe));
        aufgabenblatt4.Polygon aktuellesPolygon = model.getAktuellesPolygon();
        if (aktuellesPolygon != null) {
            aktuellesPolygon.punktHinzufuegen(punkt);
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    consoleField.clear();
}