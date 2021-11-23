public void soundClosed(Game.Control.Sound.Sound sound) {
    java.lang.System.out.println(("sounds size = " + (sounds.size())));
    for (int i = 0; i < (sounds.size()); i++) {
        if (sounds.get(i).equals(sound)) {
            sounds.remove(i);
            i--;
        }
    }
}