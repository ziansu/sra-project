private soot.jimple.Stmt init_label(final soot.javaToJimple.jj.extension.HigherLevelStructureTags initTag) {
    if (init_label_computed) {
        return init_label_value;
    }
    soot.JastAddJ.ASTNode$State state = state();
    int num = state.boundariesCrossed;
    boolean isFinal = this.is$Final();
    init_label_value = init_label_compute(initTag);
    if (isFinal && (num == (state().boundariesCrossed))) {
        init_label_computed = true;
    }
    return init_label_value;
}