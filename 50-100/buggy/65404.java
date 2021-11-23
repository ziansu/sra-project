public boolean fire(int x, int y, com.michaelspoehr.warship.game.Map map) {
    if (fireFilters.isEmpty()) {
        com.michaelspoehr.warship.ships.Ship enemy = map.getObjectAt(x, y);
        return enemy != null ? enemy.hit(x, y) : false;
    }
    boolean result = false;
    for (com.michaelspoehr.warship.utils.ActionFilter filter : fireFilters) {
        result = result & (filter.fire(x, y));
    }
    return result;
}