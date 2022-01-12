@java.lang.Override
public void handle(de.cpgaertner.edu.inf.api.level.player.Player player, de.cpgaertner.edu.inf.games.datacenter.level.groundfloor.command.go.GoCommand cmd) throws java.io.IOException {
    assert player != null;
    assert cmd != null;
    de.cpgaertner.edu.inf.api.level.Location newLoc = player.getLocation().get(cmd.getDirection());
    if (newLoc.isWalkable()) {
        player.setLocation(newLoc);
    }else {
        cmd.respondf("You cannot walk into the location in the %s", cmd.getDirection());
    }
}