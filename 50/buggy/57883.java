@java.lang.Override
protected boolean needsRender(int pos) {
    return ((data[pos]) != (-1)) && (com.shatteredpixel.shatteredpixeldungeon.levels.Level.discoverable[pos]);
}