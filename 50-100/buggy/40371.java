public static void main(java.lang.String[] args) {
    java.util.Map<java.lang.String, gvprojects.igel.view.Artist> artists = gvprojects.igel.view.IgelViewKurmas.defaultArtistMap();
    artists.put("Hail Mary", new igel.view.HailMaryArtist());
    artists.put("Pit", new gvprojects.igel.view.DeepPitArtist());
    java.lang.Class<igel.model.Game> model = igel.model.Game.class;
    gvprojects.igel.presenter.IgelArgernLauncher.configureAndLaunchGame(new gvprojects.igel.model.IgelGameParameters(), model, artists);
}