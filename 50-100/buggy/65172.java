private static java.awt.Component createComponent(org.sbolstandard.core2.ComponentDefinition currentComponent, org.sbolstandard.core2.ComponentDefinition childComp) {
    try {
        java.awt.Component component = currentComponent.createComponent(childComp.getDisplayId(), AccessType.PUBLIC, childComp.getDisplayId());
        currentComponent.createSequenceAnnotation("annotation1TODO", "genericLocation", OrientationType.INLINE);
        return component;
    } catch (org.sbolstandard.core2.SBOLValidationException e) {
        e.printStackTrace();
        return null;
    }
}