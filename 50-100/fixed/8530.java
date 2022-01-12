public void transposeUp(android.view.View v) {
    org.jsoup.nodes.Document doc = org.jsoup.Jsoup.parse(currentSong.content, "UTF-8");
    org.jsoup.select.Elements chords = doc.select("span");
    for (org.jsoup.nodes.Element e : chords) {
        e.text(transposeChord(e.text(), sk.matus.ksp.guitarist_swiss_knife.SongViewActivity.UP));
    }
    currentSong.content = doc.toString();
    displaySong(currentSong);
}