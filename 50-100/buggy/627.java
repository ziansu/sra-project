public void setup() {
    size(main.java.MainApplet.width, main.java.MainApplet.height);
    for (int i = 1; i <= 7; i++) {
        characters[i] = new java.util.ArrayList<java.lang.Character>();
    }
    smooth();
    loadData();
    minim = new main.java.Minim(this);
    song = minim.loadFile(this.getClass().getResource("/res/star_wars.mp3").getPath());
    song.play();
}