public boolean isAllowedChildDescriptor(hudson.model.TopLevelItemDescriptor tid) {
    for (com.cloudbees.hudson.plugins.folder.FolderProperty<?> p : properties) {
        if (!(p.allowsParentToCreate(tid))) {
            return false;
        }
    }
    try {
        return java.lang.Boolean.TRUE.equals(tid.getClass().getMethod("isApplicableIn", hudson.model.ItemGroup.class).invoke(tid, this));
    } catch (java.lang.NoSuchMethodException e) {
    } catch (java.lang.reflect.InvocationTargetException e) {
    } catch (java.lang.IllegalAccessException e) {
    }
    return true;
}