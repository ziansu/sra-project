public void play() {
    player = new main.moonlightowl.java.sound.Music.Layer(filelist[rand.nextInt(filelist.length)]);
    player.play();
}