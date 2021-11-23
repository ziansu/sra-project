public void addEntity(com.badlogic.ashley.core.Entity add) {
    if (Families.GRAVITY_ATTRACTED.matches(add))
        entities().add(add);
    
}