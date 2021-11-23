@java.lang.Override
public void beforeSettingsSaved() {
    persistedElements = new net.mgsx.game.examples.openworld.model.OpenWorldElement[allUserObjects.size];
    for (int i = 0; i < (persistedElements.length); i++) {
        net.mgsx.game.examples.openworld.systems.UserObjectSystem.UserObject o = allUserObjects.get(i);
        net.mgsx.game.examples.openworld.components.ObjectMeshComponent omc = ObjectMeshComponent.components.get(o.entity);
        if (o.element.dynamic) {
            omc.transform.getTranslation(o.element.position);
            omc.transform.getRotation(o.element.rotation);
        }
        persistedElements[i] = o.element;
    }
}