@java.lang.Override
public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String adesc, boolean visible) {
    final org.objectweb.asm.AnnotationVisitor av = super.visitAnnotation(desc, visible);
    switch (adesc) {
        case co.paralleluniverse.fibers.instrument.Classes.ANNOTATION_DESC :
            susp = (noImpl) ? co.paralleluniverse.fibers.instrument.MethodDatabase.SuspendableType.SUSPENDABLE_SUPER : co.paralleluniverse.fibers.instrument.MethodDatabase.SuspendableType.SUSPENDABLE;
            break;
        case co.paralleluniverse.fibers.instrument.Classes.DONT_INSTRUMENT_ANNOTATION_DESC :
            susp = co.paralleluniverse.fibers.instrument.MethodDatabase.SuspendableType.NON_SUSPENDABLE;
            break;
    }
    return av;
}