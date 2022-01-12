@com.squareup.otto.Subscribe
public void onBeginStage(it.playfellas.superapp.events.game.BeginStageEvent e) {
    synchronized(this) {
        dispenserToggle = true;
        dispenser = normalDispenser;
    }
}