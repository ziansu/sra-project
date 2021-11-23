@java.lang.SuppressWarnings(value = "unchecked")
public final int getComponentId(com.inari.firefly.system.component.IComponentName typeName) {
    if ((typeName.typeKey().baseType()) == (com.inari.firefly.system.component.SystemComponent.class)) {
        getSystemComponentId(com.inari.firefly.system.component.SystemComponent.SystemComponentKey.class.cast(typeName.typeKey()), typeName.name());
    }else
        if ((typeName.typeKey()) == (com.inari.firefly.entity.EntitySystem.Entity.ENTITY_TYPE_KEY)) {
            return getEntityId(typeName.name());
        }
    
    return -1;
}