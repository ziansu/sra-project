@java.lang.Override
public int compare(net.minecraftforge.fluids.Fluid f1, net.minecraftforge.fluids.Fluid f2) {
    if ((f1 == null) || (f1 == null)) {
        return 0;
    }
    return java.lang.Integer.compare(f1.getID(), f2.getID());
}