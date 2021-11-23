@java.lang.Override
public spoon.reflect.visitor.chain.ScanningMode enter(spoon.reflect.reference.CtTypeReference<?> typeRef, boolean isClass) {
    if (isClass) {
        if ((foundArguments) != null) {
            return spoon.reflect.visitor.chain.ScanningMode.SKIP_ALL;
        }
        lastResolvedSuperclass = typeRef;
    }
    spoon.reflect.visitor.chain.ScanningMode mode = super.enter(typeRef);
    if (mode == (spoon.reflect.visitor.chain.ScanningMode.SKIP_ALL)) {
        return mode;
    }
    return spoon.reflect.visitor.chain.ScanningMode.NORMAL;
}