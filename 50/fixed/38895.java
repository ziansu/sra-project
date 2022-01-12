@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    POIpath.setText("");
    POIpath.setHint(("Lägg till punkt nr " + ((listOfPath.size()) + 1)));
}