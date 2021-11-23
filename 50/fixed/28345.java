public static java.lang.Package self() {
    com.wm.lang.ns.NSService service = permafrost.tundra.server.ServiceHelper.self();
    if (service != null) {
        return permafrost.tundra.server.PackageHelper.getPackage(service.getPackage().getName());
    }
    return null;
}