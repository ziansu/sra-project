public void Draw(java.awt.Graphics g) {
    synchronized(mMissileList) {
        for (Missile eachMissile : mMissileList) {
            eachMissile.Draw(g);
        }
    }
}