@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    userInput.setMax(maxResults.getValue());
    userInput.setRadius(radius.getValue());
    savedSettings.edit().putInt("se.deltazulu.www.sl_closeby.maxResults", userInput.getMax()).apply();
    savedSettings.edit().putInt("se.deltazulu.www.sl_closeby.radius", userInput.getRadius()).apply();
    getStationsList();
}