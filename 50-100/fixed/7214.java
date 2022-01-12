@java.lang.Override
public void render(gov.nasa.worldwind.render.DrawContext dc) {
    try {
        super.render(dc);
    } catch (java.lang.NullPointerException e) {
        boolean followTerrain = isFollowTerrain();
        try {
            setFollowTerrain(false);
            super.render(dc);
        } finally {
            setFollowTerrain(followTerrain);
        }
    }
}