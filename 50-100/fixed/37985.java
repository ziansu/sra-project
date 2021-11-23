public void soundClosed(Game.Control.Sound.Sound sound) {
    for (int i = 0; i < (sounds.size()); i++) {
        if (sounds.get(i).equals(sound)) {
            sounds.remove(i);
            i--;
        }
    }
}