@java.lang.Override
public <I> boolean isIgnorable(final org.openflexo.foundation.resource.FlexoResourceCenter<I> resourceCenter, final I contents) {
    if (resourceCenter.isIgnorable(contents, this)) {
        return true;
    }
    if (resourceCenter.isDirectory(contents)) {
        if (isContainedInDirectoryWithSuffix(resourceCenter, contents, VirtualModelResourceFactory.FML_SUFFIX)) {
            return true;
        }
    }
    return false;
}