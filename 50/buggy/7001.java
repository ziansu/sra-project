public static int getDyeRenderColor(final int color) {
    return (color < 0) || (color > 15) ? org.blockartistry.mod.ThermalRecycling.util.DyeHelper.DEFAULT_COLOR : net.minecraft.item.ItemDye.field_150922_c[color];
}