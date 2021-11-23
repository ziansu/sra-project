public void unflattenComponentName(java.lang.String componentNameString) {
    if (componentNameString.isEmpty())
        return ;
    
    mComponentName = android.content.ComponentName.unflattenFromString(componentNameString);
    mSelectedMediaPlayerPackageName = componentNameString.substring(0, componentNameString.indexOf("/"));
}