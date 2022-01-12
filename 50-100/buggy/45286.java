@java.lang.Override
public java.lang.String activate(com.minespaceships.mod.overhead.IMenuInterface terminal, java.lang.String data) {
    com.minespaceships.mod.spaceship.Spaceship ship = com.minespaceships.mod.menu.functionalMenus.energyMenus.TerminalUtil.getShip(terminal);
    if (ship != null) {
        ship.setTarget(ship.getOrigin().add(ship.getShipLengthToAdd(terminal.getPlayerEntity())), Turn.AROUND);
    }
    return "";
}