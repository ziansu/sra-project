public java.util.List<bms.player.beatoraja.IRScoreData> readScoreDatas(java.lang.String sql) {
    return scoredb.getScoreDatas(player, sql);
}