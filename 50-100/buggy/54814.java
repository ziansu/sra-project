public static SQL.Query getSongQuery(java.lang.Object column, java.lang.Object... args) {
    return org.fasola.fasolaminutes.SQL.select(C.SongLeader.leadId, C.Song.fullName, C.Leader.fullName.func("group_concat", "', '"), C.Singing.name, C.Singing.startDate, C.SongLeader.audioUrl).where(column, "IN", args).group(column);
}