private com.example.kaloqn.mediaplayer.RandomSong getRandomSong() {
    if ((allSongsNames) == null)
        return null;
    
    int randomIndex = new java.util.Random().nextInt(allSongsNames.size());
    com.example.kaloqn.mediaplayer.RandomSong randomSong = new com.example.kaloqn.mediaplayer.RandomSong();
    java.lang.String songName = allSongsNames.get(randomIndex);
    randomSong.setSongUri(com.example.kaloqn.mediaplayer.MainActivity.songsMap.get(songName));
    randomSong.setSongNumber(randomIndex);
    return randomSong;
}