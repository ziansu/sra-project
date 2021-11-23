public void process(processings.typecheck.TPointer p) {
    if (processings.typecheck.utils.CompatibilityChecker.isRef(p.tbase())) {
        processRef(processings.typecheck.utils.CompatibilityChecker.asRef(p.tbase()));
    }else {
        p.tbase().accept(this);
    }
}