@java.lang.Override
public int compare(org.newdawn.slick.geom.Vector2f v1, org.newdawn.slick.geom.Vector2f v2) {
    org.javajumper.saboteur.SaboteurGame instance = org.javajumper.saboteur.SaboteurGame.instance;
    return ((int) ((instance.getAngleToPlayer(v1)) - ((instance.getAngleToPlayer(v2)) * 100.0)));
}