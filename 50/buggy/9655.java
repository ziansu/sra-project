@java.lang.Override
public org.openflexo.foundation.resource.RepositoryFolder<org.openflexo.foundation.fml.rt.rm.ViewResource, ?> getFolder() {
    if ((getResource()) != null) {
        return getViewLibrary().getParentFolder(((org.openflexo.foundation.fml.rt.rm.ViewResource) (getResource())));
    }
    return null;
}