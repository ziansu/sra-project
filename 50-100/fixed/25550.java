@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public void postClone(hudson.model.AbstractProject implementationProject) {
    try {
        if ((cached) != null) {
            if ((implementationProject.removeProperty(cached.getClass())) != null) {
                implementationProject.addProperty(cached);
            }
        }
    } catch (java.io.IOException e) {
        com.google.common.base.Throwables.propagate(e);
    }
}