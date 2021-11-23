@java.lang.Override
public boolean canEdit(java.lang.Object element) {
    if (element instanceof org.yakindu.sct.simulation.core.sruntime.ExecutionSlot) {
        if (!(((org.yakindu.sct.simulation.core.sruntime.ExecutionSlot) (element)).isWritable()))
            return false;
        
        org.yakindu.base.types.Type type = ((org.yakindu.sct.simulation.core.sruntime.ExecutionSlot) (element)).getType();
        return provider.getTypeSystem().isSuperType(type, getSupportedType());
    }
    return false;
}