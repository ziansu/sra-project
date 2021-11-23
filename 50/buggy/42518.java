private boolean pointInCircle(projeto.logic.CircleCollider c, projeto.logic.Vector2 p) {
    double distCenter = projeto.logic.Vector2.distance(c.getPosition(), p);
    java.lang.System.out.println(("Distancia ao Centro" + distCenter));
    return distCenter <= (c.getRadius());
}