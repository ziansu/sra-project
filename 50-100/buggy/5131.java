public julius.sky.voicehud.core.router.Route getRoute(java.lang.String drivingSimCommand) {
    julius.sky.voicehud.core.router.Route found = null;
    for (julius.sky.voicehud.core.router.Route r : super.getSimRoutes()) {
        java.lang.System.out.println(("r: " + r));
        if (r.getViewId().equals(drivingSimCommand))
            found = r;
        
    }
    return found;
}