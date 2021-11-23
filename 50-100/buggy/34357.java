@java.lang.Override
@cpw.mods.fml.relauncher.SideOnly(value = cpw.mods.fml.relauncher.Side.CLIENT)
public net.minecraft.item.ItemStack onItemRightClick(net.minecraft.item.ItemStack stack, net.minecraft.world.World world, net.minecraft.entity.player.EntityPlayer player) {
    if (player.isSneaking()) {
        if (!(minechem.Config.playerPrivateKnowledge)) {
            writeKnowledge(stack, player, world.isRemote);
        }
    }else {
        net.minecraft.client.Minecraft.getMinecraft().displayGuiScreen(new minechem.item.journal.JournalGUI(player, getKnowledgeKeys(stack), getAuthors(stack)));
    }
    minechem.helper.AchievementHelper.giveAchievement(player, this.getUnlocalizedName(), world.isRemote);
    return stack;
}