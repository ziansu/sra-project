private void initializeSequenceList() {
    sequenceVMList = new java.util.ArrayList<mta.beatmap.app.sequenceListRV.SequenceVM>();
    int imgBarId = R.mipmap.ic_short_text_white_48dp;
    int imgMeterId = R.mipmap.ic_add_white_48dp;
    int imgBpmId = R.mipmap.ic_music_note_white_48dp;
    DBHandler = new mta.beatmap.app.persistence.db.DBHandler(this);
    mta.beatmap.app.track.Track track = DBHandler.getTrack(1);
    for (int i = 0; i < (track.size()); i++) {
        sequenceVMList.add(new mta.beatmap.app.sequenceListRV.SequenceVM(track.get(i), imgBarId, imgMeterId, imgBpmId));
    }
}