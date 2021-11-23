public void removeEntity(com.badlogic.ashley.core.Entity rem) {
    if (Families.GRAVITY_ATTRACTED.matches(rem))
        entities().remove(rem);
    
}