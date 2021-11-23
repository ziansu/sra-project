@java.lang.Override
public void onCreate() {
    super.onCreate();
    if (!(com.michaelspoehr.warship.Application.setup)) {
        com.michaelspoehr.warship.game.Match m = new com.michaelspoehr.warship.game.Match(Match.Type.STANDARD);
        com.michaelspoehr.warship.game.Game.getInstance().setCurrentMatch(m);
    }
    com.michaelspoehr.warship.Application.setup = true;
}