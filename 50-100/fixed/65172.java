private static java.awt.Component createComponent(org.sbolstandard.core2.ComponentDefinition currentComponent, org.sbolstandard.core2.ComponentDefinition childComp) {
    try {
        return currentComponent.createComponent(childComp.getDisplayId(), AccessType.PUBLIC, childComp.getDisplayId());
    } catch (org.sbolstandard.core2.SBOLValidationException e) {
        e.printStackTrace();
        return null;
    }
}