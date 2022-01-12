@java.lang.Override
public wrm.hardwire.processor.model.GenField visitVariableAsField(javax.lang.model.element.VariableElement e, wrm.hardwire.processor.model.GenClass gc) {
    if ((e.getAnnotation(javax.inject.Inject.class)) == null)
        return null;
    
    wrm.hardwire.processor.model.GenClass fGenClass = root.getAssignableClass(e);
    if (fGenClass == null) {
        wrm.hardwire.processor.model.GenClass fieldClass = createAbstractClass(e);
        root.getClasses().add(fieldClass);
    }
    wrm.hardwire.processor.model.GenField genfield = new wrm.hardwire.processor.model.GenField(e.getSimpleName().toString(), fGenClass);
    gc.getFields().add(genfield);
    return genfield;
}