public void render(java.awt.Graphics2D g, double scaleX, double scaleY) {
    synchronized(_particles) {
        for (int i = 0; i < (_particles.size()); i++) {
            sw.client.psystem.Particle p = _particles.get(i);
            p.render(g, scaleX, scaleY);
        }
    }
}