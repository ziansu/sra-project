public static boolean isTransparent(org.bukkit.entity.Player player, org.bukkit.block.Block block) {
    if (java.util.Arrays.asList(Methods.transparentToEarthbending).contains(block.getTypeId())) {
        if (com.projectkorra.ProjectKorra.Methods.isRegionProtectedFromBuild(player, "Lightning", block.getLocation()))
            return false;
        else
            if (com.projectkorra.ProjectKorra.firebending.Lightning.isIce(block.getLocation()))
                return com.projectkorra.ProjectKorra.firebending.Lightning.ARC_ON_ICE;
            
        
        return true;
    }
    return false;
}