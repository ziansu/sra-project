@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj)
        return true;
    
    if (obj == null)
        return false;
    
    if ((getClass()) != (obj.getClass()))
        return false;
    
    com.potatoes.cultivation.logic.GameMap.MapCoordinates other = ((com.potatoes.cultivation.logic.GameMap.MapCoordinates) (obj));
    if ((i) != (other.i))
        return false;
    
    if ((j) != (other.j))
        return false;
    
    return true;
}