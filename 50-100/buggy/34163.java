@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    jetbrains.mps.project.structure.project.ModulePath modulePath = ((jetbrains.mps.project.structure.project.ModulePath) (o));
    if ((myVirtualFolder) != null ? !(myVirtualFolder.equals(modulePath.myVirtualFolder)) : (modulePath.myVirtualFolder) != null)
        return false;
    
    return myPath.equals(modulePath.myPath);
}