public void reset() {
    start = false;
    stop = false;
    endCause = 0;
    for (org.javajumper.saboteur.player.SPPlayer p : new java.util.ArrayList<org.javajumper.saboteur.player.SPPlayer>(players)) {
        p.setDead(false);
        p.setSprint(false);
        p.setLivepoints(100);
        p.setRole(Role.LOBBY);
        p.setReadyState(false);
    }
    deadplayers.clear();
    java.lang.System.out.println("ResetClient wurde ausgeführt");
}