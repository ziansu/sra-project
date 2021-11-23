public void moveEntity(model.entity.Entity e, model.map.pair.CoordinatePair desiredLocation, model.map.tile.AreaEffect effect, model.item.Item i, model.map.MapSwitcher switcher, model.map.tile.Trap t) {
    e.setLocation(desiredLocation);
    if (effect != null) {
        effect.activate(e);
    }
    if (i != null) {
        i.activate(e);
    }
    if (t != null) {
        t.activate(e);
    }
    if (switcher != null) {
        switcher.activate(e);
    }
}