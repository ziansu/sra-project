@java.lang.Override
protected void onStart() {
    super.onStart();
    dataSource.open();
    java.util.List<com.toddbray.basketballstats.GameModel> games = dataSource.getAllGames();
    java.util.List<com.toddbray.basketballstats.PlayerModel> players = dataSource.getAllPlayers();
    java.util.List<com.toddbray.basketballstats.StatModel> stats = dataSource.getAllStats();
    java.util.List<com.toddbray.basketballstats.SeasonModel> seasons = dataSource.getAllSeasons();
    myDataSource.execute(getApplicationContext());
}