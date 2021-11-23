@java.lang.Override
public void update(float deltaTime) {
    super.update(deltaTime);
    for (com.badlogic.ashley.core.Entity entity : removing)
        engine.removeEntity(entity);
    
    removing.clear();
}