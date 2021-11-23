public final void copy(pfg.kraken.robot.RobotState rc) {
    cinematique.copy(rc.cinematique);
    rc.date = getTempsDepuisDebutMatch();
}