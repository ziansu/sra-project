public java.util.List<utils.Song> getRandomSongList() {
    java.util.Random rand = new java.util.Random();
    int randNum;
    java.util.List<utils.Song> randomSongs = new java.util.ArrayList<utils.Song>();
    for (int i = 0; i < 3; i++) {
        randNum = (rand.nextInt(albumSongs.size())) + 1;
        java.lang.System.out.println(("random number: " + randNum));
        randomSongs.add(albumSongs.get(randNum));
    }
    return randomSongs;
}