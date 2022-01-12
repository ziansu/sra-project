private void updateTiVoFieldsOnExistingSeries(com.mayhew3.gamesutil.tv.TiVoInfo tivoInfo, com.mayhew3.gamesutil.tv.Series series) throws java.sql.SQLException {
    series.tivoSeriesV2ExtId.changeValue(tivoInfo.tivoId);
    series.tivoName.changeValue(tivoInfo.seriesTitle);
    series.isSuggestion.changeValue(tivoInfo.isSuggestion);
    series.matchedWrong.changeValue(false);
    series.tivoVersion.changeValue(2);
    series.commit(com.mayhew3.gamesutil.tv.TiVoCommunicator.sqlConnection);
    series.addViewingLocation(com.mayhew3.gamesutil.tv.TiVoCommunicator.sqlConnection, "TiVo");
}