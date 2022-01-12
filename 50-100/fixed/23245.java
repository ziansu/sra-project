@java.lang.Override
public void paint(java.awt.Graphics g) {
    super.paint(g);
    if (draw) {
        for (int i = 0; i < (videos.size()); i++) {
            g.drawImage(videos.get(i), 0, (((defaultImageHeight) * i) + (i * 20)), this);
        }
        videos.clear();
        draw = false;
    }
}