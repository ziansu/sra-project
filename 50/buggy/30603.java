protected java.lang.String getUnwrappedUnlocalizedName(java.lang.String unlocalizedName) {
    java.lang.String x = unlocalizedName.substring(((unlocalizedName.indexOf(".")) + 1));
    com.senseidragon.letsmodreloaded.utility.LogHelper.info(("G3:" + x));
    return x;
}