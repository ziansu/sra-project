private static void getRidOfPassedCheckpointsNear(Player.Buster buster) {
    java.util.List<Player.Agent> tbd = new java.util.ArrayList<Player.Agent>();
    for (Player.Agent point : Player.checkpoints) {
        if ((buster.distanceTo(point)) < (Player.RADAR_DISTANCE)) {
            tbd.add(point);
        }
    }
    Player.checkpoints.removeAll(tbd);
    java.lang.System.err.println(("checkpoints remaining " + (Player.checkpoints.size())));
}