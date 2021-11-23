@java.lang.Override
public void call(java.lang.Object... objects) {
    java.lang.System.out.println(objects[0]);
    org.cubecorp.hexicube.joustybet.scoreboard.StateAdapter sa = new org.cubecorp.hexicube.joustybet.scoreboard.StateAdapter(((java.lang.String) (objects[0])));
    org.cubecorp.hexicube.joustybet.scoreboard.Game.betters = sa.getBetters();
    org.cubecorp.hexicube.joustybet.scoreboard.Game.roundActive = sa.isRoundActive();
    org.cubecorp.hexicube.joustybet.scoreboard.Game.lastWinner = sa.getLastWinner();
    org.cubecorp.hexicube.joustybet.scoreboard.Game.needsRendering = true;
}