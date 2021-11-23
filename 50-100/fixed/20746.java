@org.junit.Test
public void testCalculateSongLengths() throws java.lang.Exception {
    tdd.musicdb.AlbumParser parser = new tdd.musicdb.AlbumParser();
    parser.offsets.add(150);
    parser.offsets.add(12143);
    parser.offsets.add(31682);
    parser.discLengthSecs = 607;
    java.util.List<java.lang.Integer> lengthsSecs = parser.calculateSongLengths();
    org.approvaltests.Approvals.approve(lengthsSecs.toString());
}