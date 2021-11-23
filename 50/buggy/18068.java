@java.lang.Override
public void setMap(final model.IMap map) {
    super.setMap(map);
    this.getMap().setMyCharacter(this);
}