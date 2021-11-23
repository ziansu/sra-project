public void saveState(proto.game.world.Session s) throws java.lang.Exception {
    super.saveState(s);
    for (proto.game.world.Region.Level l : statLevels) {
        s.saveInt(l.bonus);
        s.saveInt(l.level);
        s.saveFloat(l.current);
    }
    s.saveObjectArray(buildSlots);
}