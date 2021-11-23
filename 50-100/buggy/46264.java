public boolean intersects(fettuccine.sprite.CollisionMap.MapComponent m) {
    if (bounds.intersects(m.bounds)) {
        for (fettuccine.geom.Vector2 v : m.data) {
            if (this.intersects(v)) {
                return true;
            }
        }
        return false;
    }else {
        return false;
    }
}