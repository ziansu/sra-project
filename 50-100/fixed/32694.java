public void saveState(proto.game.world.Session s) throws java.lang.Exception {
    super.saveState(s);
    for (proto.game.world.Region.Level l : statLevels) {
        s.saveFloat(l.bonus);
        s.saveFloat(l.level);
        s.saveFloat(l.current);
    }
    s.saveObjectArray(buildSlots);
}