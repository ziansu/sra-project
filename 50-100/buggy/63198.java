@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj)
        return true;
    
    if ((this) == null)
        return false;
    
    if ((this.getClass()) != (obj.getClass()))
        return false;
    
    return (index) == (((fiftyone.mobile.detection.entities.Value) (obj)).index);
}