public julius.sky.voicehud.core.router.Route getRoute(java.lang.String drivingSimCommand) {
    java.lang.System.out.println(super.getSimRoutes());
    julius.sky.voicehud.core.router.Route found = null;
    for (julius.sky.voicehud.core.router.Route r : super.getSimRoutes()) {
        java.lang.System.out.println((("r: " + r) + (r.getViewId())));
        if (r.getViewId().equals(drivingSimCommand))
            found = r;
        
    }
    return found;
}