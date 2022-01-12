public void setup() {
    smooth();
    for (int i = 0; i < (fnames.length); i++) {
        imgs[i] = loadImage(((fnames[i]) + ".png"));
    }
    font = createFont("font.ttf", 25);
    mover = new ie.dit.Planet(this);
    menu = new ie.dit.Menu(this, imgs, font);
    tex = new ie.dit.Textures(this, imgs, font);
}