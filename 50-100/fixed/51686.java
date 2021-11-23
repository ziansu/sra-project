public void contact(com.jellyfish.objects.GameObject o) {
    if (o instanceof com.jellyfish.objects.Wall) {
        com.badlogic.gdx.math.Intersector.MinimumTranslationVector mtv = new com.badlogic.gdx.math.Intersector.MinimumTranslationVector();
        com.badlogic.gdx.math.Intersector.overlapConvexPolygons(boundingBox, o.getBoundingBox(), mtv);
        moveBy(((mtv.normal.x) * (mtv.depth)), ((mtv.normal.y) * (mtv.depth)));
    }
}