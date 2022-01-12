@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj == null)
        return false;
    
    if (!(obj instanceof cz.dd4j.simulation.data.dungeon.elements.places.Corridor))
        return false;
    
    cz.dd4j.simulation.data.dungeon.elements.places.Corridor other = ((cz.dd4j.simulation.data.dungeon.elements.places.Corridor) (obj));
    return ((cz.dd4j.utils.Safe.equals(room1, other.room1)) && (cz.dd4j.utils.Safe.equals(room2, other.room2))) || ((cz.dd4j.utils.Safe.equals(room1, other.room2)) && (cz.dd4j.utils.Safe.equals(room2, other.room1)));
}