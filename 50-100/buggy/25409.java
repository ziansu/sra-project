public static void connect(android.content.Context ctx) {
    if (((cgeo.geocaching.maps.brouter.BRouter.brouter) != null) && (cgeo.geocaching.maps.brouter.BRouter.brouter.isConnected())) {
        return ;
    }
    cgeo.geocaching.maps.brouter.BRouter.brouter = new cgeo.geocaching.maps.brouter.BRouterServiceConnection();
    android.content.Intent intent = new android.content.Intent();
    intent.setClassName("btools.routingapp", "btools.routingapp.BRouterService");
    boolean hasBRouter = ctx.bindService(intent, cgeo.geocaching.maps.brouter.BRouter.brouter, Context.BIND_AUTO_CREATE);
    if (!hasBRouter) {
        cgeo.geocaching.maps.brouter.BRouter.brouter = null;
    }
}