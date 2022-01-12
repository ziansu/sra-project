@java.lang.Override
public void restoreFromBundle(com.watabou.utils.Bundle bundle) {
    super.restoreFromBundle(bundle);
    int[] values = bundle.getIntArray(com.shatteredpixel.shatteredpixeldungeon.items.artifacts.TimekeepersHourglass.timeFreeze.PRESSES);
    for (int i = 0; i < (values.length); i++)
        presses.add(values[i]);
    
    partialTime = bundle.getFloat(com.shatteredpixel.shatteredpixeldungeon.items.artifacts.TimekeepersHourglass.timeFreeze.PARTIALTIME);
}