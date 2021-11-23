public void run() {
    if (name.equals("Musique")) {
        sound.SoundPlayer leia = new sound.SoundPlayer();
        leia.start();
    }else {
        new graph.PageAccueil();
    }
}