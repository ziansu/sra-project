@java.lang.Override
public java.util.List<us.ihmc.euclid.tuple2D.Vector2D> getCoPForwardOffsetBounds() {
    us.ihmc.euclid.tuple2D.Vector2D heelBounds = new us.ihmc.euclid.tuple2D.Vector2D((-0.04), 0.03);
    us.ihmc.euclid.tuple2D.Vector2D ballBounds = new us.ihmc.euclid.tuple2D.Vector2D(0.0, 0.08);
    heelBounds.scale(modelScale);
    ballBounds.scale(modelScale);
    java.util.List<us.ihmc.euclid.tuple2D.Vector2D> copBounds = new java.util.ArrayList<>();
    copBounds.add(heelBounds);
    copBounds.add(ballBounds);
    copBounds.add(ballBounds);
    return copBounds;
}