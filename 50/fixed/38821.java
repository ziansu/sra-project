@java.lang.Override
public void onTileClicked(com.werwolv.api.event.input.mouse.EnumMouseButton button, com.werwolv.entities.EntityPlayer player, com.werwolv.world.World world, int x, int y) {
    player.openGui(com.werwolv.main.ModMain.class, 0);
}