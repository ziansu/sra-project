@java.lang.Override
public boolean equals(java.lang.Object o) {
    if (o == (this))
        return true;
    
    if (!(o instanceof geometry.shapes.Angle))
        return false;
    
    geometry.shapes.Angle a = ((geometry.shapes.Angle) (o));
    return isValidName(a.getName());
}