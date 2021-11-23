@java.lang.Override
public void signalReceived(engine.util.event.ModelEvent<models.TileModel> event) {
    java.lang.String signalName = unregisterListener(this);
    if (((_currentlyActiveTile) != null) && (_currentlyActiveTile.getSelected())) {
        _currentlyActiveTile.setSelected(false);
    }
    _currentlyActiveTile = event.getSource();
    registerListener(signalName, this);
}