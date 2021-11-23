public void run() {
    pl.qus.xenoamp.musicbrainz.MBRecordingList możliweUtwory = pl.qus.xenoamp.musicbrainz.MBParser.searchRecording("Noctuary");
    java.util.Vector<pl.qus.xenoamp.musicbrainz.MBEzRecording> płyty = pl.qus.xenoamp.musicbrainz.MBParser.convertToEz(możliweUtwory);
    pl.qus.xenoamp.musicbrainz.MBRelease wybrana = pl.qus.xenoamp.musicbrainz.MBParser.lookupRelease(płyty.elementAt(0).getReleaseId());
    pl.qus.xenoamp.musicbrainz.MBEzRelease moja = new pl.qus.xenoamp.musicbrainz.MBEzRelease(wybrana);
    pl.qus.xenoamp.helper.Logger.d(("dwed" + moja));
}