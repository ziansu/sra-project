private static java.awt.Component modifySavedComponents(int index, boolean remove) {
    java.awt.Component component = SmartInterface.components.get(index);
    if (remove) {
        return null;
    }else {
        SmartInterface.savedComponents.add(((((component.getIdentifier()) + "`") + index) + '`'));
        return component;
    }
}