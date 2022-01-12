@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    com.fosterstory.entity.Animal animal = ((com.fosterstory.entity.Animal) (o));
    return ((getId()) != null) && (getId().equals(animal.getId()));
}