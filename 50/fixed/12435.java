private int getFuelValue(net.minecraftforge.fluids.Fluid fluid) {
    java.lang.Integer value = pneumaticCraft.common.PneumaticCraftAPIHandler.getInstance().liquidFuels.get(fluid.getName());
    return value == null ? 0 : value;
}