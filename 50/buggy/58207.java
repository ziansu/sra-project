@com.squareup.otto.Subscribe
public void onBeginStage(it.playfellas.superapp.events.game.BeginStageEvent e) {
    dispenserToggle = true;
    dispenser = normalDispenser;
}