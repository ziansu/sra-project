public void transposeUp(android.view.View v) {
    android.util.Log.i("HTML", currentSong.content);
    org.jsoup.nodes.Document doc = org.jsoup.Jsoup.parse(currentSong.content, "UTF-8");
    org.jsoup.select.Elements chords = doc.select("span");
    for (org.jsoup.nodes.Element e : chords) {
        android.util.Log.i("CHORD", e.text());
        e.text(transposeChord(e.text(), sk.matus.ksp.guitarist_swiss_knife.SongViewActivity.UP));
    }
    currentSong.content = doc.toString();
    displaySong(currentSong);
}