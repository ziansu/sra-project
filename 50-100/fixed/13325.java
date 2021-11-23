private void reset() {
    set(energyBar, 0, 0, true);
    set(happyBar, 0, 0, true);
    set(nerveBar, 0, 0, true);
    set(lifeBar, 0, 0, true);
    set(travelBar, 0, 0, true);
    energyBarText.setText("0/0");
    happyBarText.setText("0/0");
    nerveBarText.setText("0/0");
    lifeBarText.setText("0/0");
    travelBarText.setText("0/0s");
}