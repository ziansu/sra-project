@java.lang.Override
public java.lang.String computeURL() {
    com.google.common.base.Optional<gamercompanion.src.dataObjects.credentials.WebCredentials> credentials = gamercompanion.src.dataOperator.CredentialsOperator.credentialsForWebsite(gamercompanion.src.synchronizer.MetascoreAllGames.WEBSITE);
    if (!(credentials.isPresent())) {
        gamercompanion.src.error.ErrorUtil.showWarning((("No credentials for website '" + (gamercompanion.src.synchronizer.MetascoreAllGames.WEBSITE)) + "' found in system.properties"));
        return java.lang.String.format(gamercompanion.src.synchronizer.MetascoreAllGames.EMPTY_METASCORE_ALL_GAMES_URL_PATTERN, _platform());
    }
    return java.lang.String.format(gamercompanion.src.synchronizer.MetascoreAllGames.METASCORE_ALL_GAMES_URL_PATTERN, credentials.get()._username(), credentials.get()._password(), _platform()._allGamesURLname);
}