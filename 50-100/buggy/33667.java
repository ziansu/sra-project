@com.google.inject.persist.Transactional
public java.util.List<me.moodcat.database.entities.Song> listRandomsongs(final int limit) {
    return query().from(me.moodcat.database.entities.QSong.song).where(song.valenceArousal.location.x().eq(0).and(song.valenceArousal.location.y().eq(0))).orderBy(com.mysema.query.types.expr.NumberExpression.random().asc()).limit(limit).list(me.moodcat.database.entities.QSong.song);
}