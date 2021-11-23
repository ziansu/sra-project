@java.lang.Override
public void thumbsUp() {
    validateRadioState();
    pandoraRadio.rate(song, true);
    song = new com.sleazyweasel.pandora.Song(song, 1);
    notifyListeners();
}