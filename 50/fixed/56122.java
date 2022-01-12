@java.lang.Override
public void trigger(ca.afroman.entity.api.Entity e) {
    flop = !(flop);
    updateTile();
    super.trigger(e);
}