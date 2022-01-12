@java.lang.Override
public boolean canRecieve(com.loovjo.spg.chem.Material m, com.loovjo.spg.gui.machines.Machine mach, int port) {
    return (super.canRecieve(m, mach, port)) && (m == null ? true : new com.loovjo.loo2D.utils.Vector(mach.x, mach.y).equals(getStart()));
}