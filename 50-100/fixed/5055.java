@java.lang.Override
public void updateTabArea() {
    indicator.DrumTab tab = new indicator.BasicDrumTab(track);
    tabArea.setText(tab.drawTabPage(((cycle) + 1), track.size(), track.size()).getCurrentTab());
    if ((cycle) >= (track.size())) {
        cycle = 0;
    }
}