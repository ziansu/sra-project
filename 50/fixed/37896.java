public void makeRemove(com.badlogic.ashley.core.Entity entity) {
    this.type = com.badlogic.ashley.core.Engine.ComponentOperation.Type.Remove;
    this.entity = entity;
}