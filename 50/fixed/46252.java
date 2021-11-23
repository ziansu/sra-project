private void changeMusicRandom() {
    last = current;
    if ((musics.size()) > 0) {
        current = new java.util.Random().nextInt(musics.size());
    }
    changeMusic();
}