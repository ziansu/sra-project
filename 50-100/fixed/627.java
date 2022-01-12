public void setup() {
    size(main.java.MainApplet.width, main.java.MainApplet.height);
    characters = new java.util.ArrayList<java.util.ArrayList<java.lang.Character>>();
    for (int i = 1; i <= 7; i++) {
        characters.add(new java.util.ArrayList<java.lang.Character>());
    }
    smooth();
    loadData();
    minim = new main.java.Minim(this);
}