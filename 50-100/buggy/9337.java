private void drawMon(java.awt.Graphics g) {
    synchronized(com.kurtzbot.Cache.class) {
        for (com.kurtzbot.CachedMon mon : cache.getCurrent()) {
            g.setColor(new java.awt.Color(255, 135, 232));
            g.drawOval((((int) (mon.x)) - 12), (((int) (mon.y)) - 12), 24, 24);
        }
    }
}