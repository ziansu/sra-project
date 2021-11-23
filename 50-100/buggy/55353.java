public static java.lang.String getTradeRouteName(net.sf.freecol.common.model.Player player) {
    java.lang.String base = net.sf.freecol.common.i18n.Messages.message("nameCache.base.tradeRoute");
    if ((player.getTradeRouteByName(base, null)) == null)
        return base;
    
    java.lang.String name;
    int i = 1;
    while ((player.getTradeRouteByName((name = base + (i++)), null)) != null);
    return name;
}