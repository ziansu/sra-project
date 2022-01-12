private org.bukkit.block.Sign checkBlock(org.bukkit.block.Block i, org.bukkit.Location s) {
    org.bukkit.block.Block sign = s.getBlock();
    org.bukkit.material.MaterialData data = sign.getState().getData();
    if (data instanceof org.bukkit.block.Sign) {
        org.bukkit.block.Sign signData = ((org.bukkit.block.Sign) (data));
        if (sign.getRelative(signData.getAttachedFace()).equals(i))
            return ((org.bukkit.block.Sign) (sign.getState()));
        else
            return null;
        
    }else
        return null;
    
}