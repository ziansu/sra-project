public static de.htw.fb4.imi.master.ws15_16.foellmer_feldmann.ip.Vertex calcMiddle(de.htw.fb4.imi.master.ws15_16.foellmer_feldmann.ip.Vertex a, de.htw.fb4.imi.master.ws15_16.foellmer_feldmann.ip.Vertex b) {
    int middleX = (a.getX()) + (((b.getX()) - (a.getX())) / 2);
    int middleY = (a.getY()) + (((b.getY()) - (a.getY())) / 2);
    return new de.htw.fb4.imi.master.ws15_16.foellmer_feldmann.ip.Vertex(middleX, middleY);
}