public void addedToEngine(com.badlogic.ashley.core.Engine e) {
    for (com.badlogic.ashley.core.Entity add : e.getEntitiesFor(Families.GRAVITY_ATTRACTED))
        entities().add(add);
    
}