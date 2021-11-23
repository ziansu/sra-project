@java.lang.Override
public void setPlayable(org.subquark.tetris_station.GameState gs, org.subquark.tetris_station.cards.Card c) {
    if ((gs.shipPosition) >= (minimum)) {
        c.canPlay = true;
    }else {
        c.canPlay = false;
        c.cannotPlayReason = "Too close to sun";
    }
}