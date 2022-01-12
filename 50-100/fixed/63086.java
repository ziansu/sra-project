public void IncPlayerStat(java.lang.String s, coup_standalone.Player p) throws java.lang.IllegalArgumentException {
    s = s.toUpperCase();
    if (!(this.getKeys().contains(s))) {
        throw new java.lang.IllegalArgumentException(("Invalid stat name: " + s));
    }
    java.util.Map<java.lang.String, java.lang.Integer> m = getMap(p);
    int oldvalue = m.get(s);
    m.replace(s, (oldvalue + 1));
}