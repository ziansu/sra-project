private boolean checkBlock(org.bukkit.block.Block i, org.bukkit.Location s) {
    org.bukkit.block.Block sign = s.getBlock();
    org.bukkit.material.MaterialData data = sign.getState().getData();
    if (data instanceof org.bukkit.block.Sign) {
        org.bukkit.block.Sign signData = ((org.bukkit.block.Sign) (data));
        if (sign.getRelative(signData.getAttachedFace()).equals(i))
            return true;
        else
            return false;
        
    }else
        return false;
    
}