@java.lang.Override
public void restoreFromBundle(com.watabou.utils.Bundle bundle) {
    super.restoreFromBundle(bundle);
    int[] values = bundle.getIntArray(com.shatteredpixel.shatteredpixeldungeon.items.artifacts.TimekeepersHourglass.timeFreeze.PRESSES);
    for (int value : values)
        presses.add(value);
    
    partialTime = bundle.getFloat(com.shatteredpixel.shatteredpixeldungeon.items.artifacts.TimekeepersHourglass.timeFreeze.PARTIALTIME);
}