protected void useAbility(hackbotcore.Unit target) {
    assert (selected) != null;
    assert (selectedAbility) != null;
    if (selected.useAbility(selectedAbility, target)) {
        java.lang.System.out.println("test");
        for (hackbotcore.Unit u : units) {
            if ((u.sectors.size()) == 0) {
                units.remove(u);
            }
        }
    }
}