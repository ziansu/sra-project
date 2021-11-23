private io.yawp.plugin.devserver.appengine.AppengineUserRealm createAppengineUserRealm() {
    io.yawp.plugin.devserver.appengine.AppengineWebAppContext appengineWebApp = ((io.yawp.plugin.devserver.appengine.AppengineWebAppContext) (webapp));
    return new io.yawp.plugin.devserver.appengine.AppengineUserRealm(appengineWebApp.getHelper());
}