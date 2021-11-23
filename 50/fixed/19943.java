public void play() {
    if ((filelist.length) > 0) {
        player = new main.moonlightowl.java.sound.Music.Layer(filelist[rand.nextInt(filelist.length)]);
        player.play();
    }
}