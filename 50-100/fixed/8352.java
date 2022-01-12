public static void updateClient(com.robrit.moofluids.common.entity.EntityFluidCow fluidCow, long worldTime) {
    net.minecraft.nbt.NBTTagCompound tag = fluidCow.getEntityData();
    if ((tag.hasKey("rfc:nextUpdate")) && ((tag.getLong("rfc:nextUpdate")) > worldTime)) {
        return ;
    }
    com.jdlogic.ranchablefluidcows.ranchable.RanchableFC.sendPacket(fluidCow);
    tag.setLong("rfc:nextUpdate", (worldTime + (20 * 10)));
}