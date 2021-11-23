@java.lang.Override
public void switchOn(net.minecraft.util.math.BlockPos switchedOnFrom) {
    if ((switchedOnFrom != null) && (!(onSwitches.contains(switchedOnFrom.toLong()))))
        onSwitches.add(switchedOnFrom.toLong());
    
    setSwitchedOn(true);
}