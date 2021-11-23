public void removeUnit(kingofthehill.domain.Unit unit) {
    int i = 0;
    for (kingofthehill.domain.Unit u : this.units) {
        if (u == unit) {
            this.units[i] = null;
            unit.setBase(null);
            return ;
        }
        i++;
    }
}