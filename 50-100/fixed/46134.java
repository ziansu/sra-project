@org.junit.Test
public void depart_jaune_cratere_HL() throws java.lang.Exception {
    robot.Cinematique depart = new robot.Cinematique(550, 1905, ((-(java.lang.Math.PI)) / 2), true, 0);
    robot.setCinematique(depart);
    data.correctPosition(depart.getPosition(), depart.orientationReelle);
    java.lang.Thread.sleep(100);
    pathcache.computeAndFollowToScript(new pathfinding.KeyPathCache(state, ScriptNames.SCRIPT_CRATERE_HAUT_DROITE.s, false));
}