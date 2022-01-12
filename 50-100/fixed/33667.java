@com.google.inject.persist.Transactional
public java.util.List<me.moodcat.database.entities.Song> listRandomsongs(final int limit) {
    final com.mysema.query.types.expr.NumberExpression<java.lang.Double> x = song.valenceArousal.location.x();
    return query().from(me.moodcat.database.entities.QSong.song).where(x.eq(0.0).and(song.valenceArousal.location.y().eq(0.0))).orderBy(com.mysema.query.types.expr.NumberExpression.random().asc()).limit(limit).list(me.moodcat.database.entities.QSong.song);
}