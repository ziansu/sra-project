boolean addInternal(com.badlogic.ashley.core.Component component) {
    java.lang.Class<? extends com.badlogic.ashley.core.Component> componentClass = component.getClass();
    com.badlogic.ashley.core.Component oldComponent = getComponent(componentClass);
    if (component == oldComponent) {
        return false;
    }
    if (oldComponent != null) {
        removeInternal(componentClass);
    }
    int componentTypeIndex = com.badlogic.ashley.core.ComponentType.getIndexFor(componentClass);
    components.set(componentTypeIndex, component);
    componentsArray.add(component);
    componentBits.set(componentTypeIndex);
    return true;
}