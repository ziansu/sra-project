private void validateReversedOriginalVariant(fr.inria.astor.core.entities.ProgramVariant variant) {
    for (spoon.reflect.declaration.CtType st : variant.getAffectedClasses()) {
        java.lang.String original = originalModel.get(st.getQualifiedName());
        if (original != null) {
            boolean idem = original.equals(st.toString());
            if (!idem) {
                log.error("Error: the model was not the same from the original after this generation");
            }
        }
    }
}