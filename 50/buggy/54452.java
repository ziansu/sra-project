public void makeAdd(com.badlogic.ashley.core.Entity entity, com.badlogic.ashley.core.Component component) {
    this.type = com.badlogic.ashley.core.Engine.ComponentOperation.Type.Add;
    this.entity = entity;
    this.component = component;
    this.componentClass = null;
}