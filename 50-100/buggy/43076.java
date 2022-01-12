@java.lang.Override
public void addWailaInfo(java.util.List<java.lang.String> info) {
    if ((tank.getFluid()) != null) {
        info.add((((tank.getFluidAmount()) + " of ") + (tank.getFluidType().getName())));
    }else {
        info.add("Empty");
    }
    info.add((("Capacity " + (tank.getCapacity())) + " mb"));
}