@java.lang.Override
public java.lang.Object perform(java.lang.String name, java.lang.Object obj, io.github.ibuildthecloud.gdapi.request.ApiRequest request) {
    if (!(obj instanceof io.cattle.platform.core.model.Environment)) {
        return null;
    }
    io.cattle.platform.core.model.Environment env = ((io.cattle.platform.core.model.Environment) (obj));
    java.util.List<? extends io.cattle.platform.core.model.Service> services = sdService.listEnvironmentServices(env.getId());
    activateServices(services);
    return env;
}