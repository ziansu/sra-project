public void process(processings.typecheck.TPointer p) {
    if (!(processings.typecheck.utils.CompatibilityChecker.isRef(p.tbase()))) {
        p.tbase().accept(this);
    }else {
        processRef(processings.typecheck.utils.CompatibilityChecker.asRef(p.tbase()));
    }
}