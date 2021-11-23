public org.openflexo.fib.utils.FIBInspector inspectorForObject(java.lang.Object object) {
    if (object == null) {
        return null;
    }
    if (object instanceof org.openflexo.foundation.fml.rt.FlexoConceptInstance) {
        return inspectorForFlexoConceptInstance(((org.openflexo.foundation.fml.rt.FlexoConceptInstance) (object)));
    }
    return inspectorForClass(object.getClass());
}