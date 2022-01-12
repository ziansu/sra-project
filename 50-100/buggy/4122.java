@java.lang.Override
public boolean equals(java.lang.Object otherSighting) {
    if (!(otherSighting instanceof Sighting)) {
        return false;
    }else {
        Sighting newSighting = ((Sighting) (otherSighting));
        return (((this.getAnimalId()) == (newSighting.getAnimalId())) && (this.getLocation().equals(newSighting.getLocation()))) && (this.getRangerId().equals(newSighting.getRangerId()));
    }
}