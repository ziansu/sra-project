@java.lang.Override
public void afterInjection(java.lang.Object injectee) {
    org.apache.sling.api.resource.Resource resource = currentResourceProvider.get().get();
    if (resource == null) {
        return ;
    }
    com.cognifide.slice.mapper.api.Mapper mapper = mapperProvider.get();
    com.cognifide.slice.core.internal.module.SliceResourceModule.SliceResourceMethodLauncher.invokeMethodFor(com.cognifide.slice.mapper.annotation.PreMapping.class, injectee);
    mapper.get(resource, injectee);
    com.cognifide.slice.core.internal.module.SliceResourceModule.SliceResourceMethodLauncher.invokeMethodFor(com.cognifide.slice.mapper.annotation.PostMapping.class, injectee);
    if (injectee instanceof com.cognifide.slice.api.model.InitializableModel) {
        ((com.cognifide.slice.api.model.InitializableModel) (injectee)).afterCreated();
    }
}