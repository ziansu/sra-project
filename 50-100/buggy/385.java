com.badlogic.ashley.core.Component removeInternal(java.lang.Class<? extends com.badlogic.ashley.core.Component> componentClass) {
    com.badlogic.ashley.core.ComponentType componentType = com.badlogic.ashley.core.ComponentType.getFor(componentClass);
    int componentTypeIndex = componentType.getIndex();
    com.badlogic.ashley.core.Component removeComponent = components.get(componentTypeIndex);
    if (removeComponent != null) {
        components.set(componentTypeIndex, null);
        componentsArray.removeValue(removeComponent, true);
        componentBits.clear(componentTypeIndex);
        componentRemoved.dispatch(this);
    }
    return removeComponent;
}