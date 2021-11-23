@java.lang.Override
public boolean canTake(com.loovjo.spg.chem.Material m, com.loovjo.spg.gui.machines.Machine mach, int port) {
    return ((m == null) || (mach == null)) || ((m.getWeight()) < (content.getWeight()));
}