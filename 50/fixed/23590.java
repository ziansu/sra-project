public static void paintBlock(org.bukkit.block.Block b, org.bukkit.DyeColor team) {
    if (!(b.getType().equals(net.happitopia.mcpaintball.Paintball.PAINT)))
        return ;
    
    b.setType(net.happitopia.mcpaintball.Paintball.PAINT);
    b.setData(team.getData());
}