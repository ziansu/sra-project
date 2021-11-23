public static boolean canUseToken(android.content.Context context, int instance) {
    return (github.daneren2005.dsub.domain.ServerInfo.isStockSubsonic(context, instance)) && (github.daneren2005.dsub.domain.ServerInfo.checkServerVersion(context, "1.13", instance));
}