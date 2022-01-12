private double getElectricityCount(net.minecraft.item.ItemStack itemStack) {
    org.halvors.electrometrics.common.base.MachineType machineType = org.halvors.electrometrics.common.base.MachineType.getType(itemStack);
    switch (machineType) {
        case BASIC_ELECTRICITY_METER :
        case ADVANCED_ELECTRICITY_METER :
        case ELITE_ELECTRICITY_METER :
        case ULTIMATE_ELECTRICITY_METER :
            if ((itemStack.stackTagCompound) != null) {
                return itemStack.stackTagCompound.getDouble("electricityCount");
            }
        default :
            return 0;
    }
}