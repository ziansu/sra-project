public void setPlayer(application.Player o) {
    if ((placed) != null) {
        placed.moveEvent(o);
    }
    player = o;
    if ((zpm) != null)
        zpm.collect();
    
}