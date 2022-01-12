private int getChildIdAt(float x, float y) {
    if (y > (this.y)) {
        if (x > (this.x)) {
            return org.tiralab.particles.TreeStorage.QuadTree.CHILD_TR;
        }else {
            return org.tiralab.particles.TreeStorage.QuadTree.CHILD_TL;
        }
    }else {
        if (x > (this.x)) {
            return org.tiralab.particles.TreeStorage.QuadTree.CHILD_BR;
        }else {
            return org.tiralab.particles.TreeStorage.QuadTree.CHILD_BL;
        }
    }
}