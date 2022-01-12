protected static java.util.List<com.vaguehope.morrigan.model.media.IMixedMediaItem> local_parseRecordSet(final java.sql.ResultSet rs, final com.vaguehope.morrigan.model.media.internal.db.mmdb.MixedMediaItemFactory itemFactory) throws java.sql.SQLException {
    final java.util.List<com.vaguehope.morrigan.model.media.IMixedMediaItem> ret = new java.util.ArrayList<com.vaguehope.morrigan.model.media.IMixedMediaItem>();
    if (rs.next()) {
        final com.vaguehope.morrigan.model.media.internal.db.mmdb.MixedMediaSqliteLayerInner.ColumnIndexes indexes = new com.vaguehope.morrigan.model.media.internal.db.mmdb.MixedMediaSqliteLayerInner.ColumnIndexes(rs);
        do {
            ret.add(com.vaguehope.morrigan.model.media.internal.db.mmdb.MixedMediaSqliteLayerInner.createMediaItem(rs, indexes, itemFactory));
        } while (rs.next() );
    }
    return ret;
}