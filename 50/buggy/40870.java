@java.lang.Override
public void onClick(android.view.View v) {
    if (showBusStop.isSelected()) {
        showBusStop.setSelected(false);
        setAllNormalPinsVisibility(popBusStationPins, false);
    }else {
        showBusStop.setSelected(true);
        setAllNormalPinsVisibility(popBusStationPins, false);
    }
}