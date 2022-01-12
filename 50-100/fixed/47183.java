@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj)
        return true;
    
    if (obj == null)
        return false;
    
    if ((getClass()) != (obj.getClass()))
        return false;
    
    org.uibk.iis.robotprojectapp.OdometryManager.Position other = ((org.uibk.iis.robotprojectapp.OdometryManager.Position) (obj));
    return equals(other, 0.5);
}