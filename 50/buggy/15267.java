@java.lang.Override
public void onDetach() {
    for (com.shatteredpixel.shatteredpixeldungeon.items.Item item : items) {
        ((com.shatteredpixel.shatteredpixeldungeon.items.wands.Wand) (item)).stopCharging();
    }
}