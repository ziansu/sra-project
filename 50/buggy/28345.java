public static java.lang.Package self() {
    com.wm.lang.ns.NSService service = permafrost.tundra.server.ServiceHelper.self();
    java.lang.Package pkg = null;
    if (service != null) {
        pkg = permafrost.tundra.server.PackageHelper.getPackage(service.getPackage().getName());
    }
    return pkg;
}