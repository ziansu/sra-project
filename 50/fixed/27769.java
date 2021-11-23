public static boolean isSolid(org.bukkit.block.Block block) {
    return !(java.util.Arrays.asList(com.projectkorra.projectkorra.GeneralMethods.nonOpaque).contains(block.getTypeId()));
}