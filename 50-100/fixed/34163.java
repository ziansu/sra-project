@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj) {
        return true;
    }
    if ((obj == null) || ((getClass()) != (obj.getClass()))) {
        return false;
    }
    jetbrains.mps.project.structure.project.ModulePath modulePath = ((jetbrains.mps.project.structure.project.ModulePath) (obj));
    return (myPath.equals(modulePath.myPath)) && ((myVirtualFolder) == null ? (modulePath.myVirtualFolder) == null : myVirtualFolder.equals(modulePath.myVirtualFolder));
}