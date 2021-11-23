public void tryAbility(hackbotutil.Coordinate coord) {
    if (!(iface.useAbility(coord)));
    java.lang.System.out.println("Ability use failed");
    update();
}