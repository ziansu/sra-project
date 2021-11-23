private static java.lang.String generateDefaultID(org.eclipse.emf.ecore.EObject obj) {
    java.lang.String name = org.eclipse.bpmn2.modeler.core.utils.ModelUtil.getObjectName(obj);
    java.lang.Integer value = org.eclipse.bpmn2.modeler.core.utils.ModelUtil.defaultIds.get(name);
    if (value == null)
        value = java.lang.Integer.valueOf(1);
    
    value = java.lang.Integer.valueOf(((value.intValue()) + 1));
    org.eclipse.bpmn2.modeler.core.utils.ModelUtil.defaultIds.put(name, java.lang.Integer.valueOf(value));
    return (("_" + name) + "_") + value;
}