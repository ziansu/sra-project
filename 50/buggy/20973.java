@java.lang.Override
public void run() {
    net.minecraft.entity.player.EntityPlayer player = ctx.getServerHandler().playerEntity;
    com.phylogeny.extrabitmanipulation.helper.SculptSettingsHelper.setHollowShape(player, player.getCurrentEquippedItem(), message.hollowShape, message.isWire);
}