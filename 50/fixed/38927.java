public de.uni_freiburg.informatik.ultimate.logic.TermVariable removeOutVar(final de.uni_freiburg.informatik.ultimate.modelcheckerutils.cfg.variables.IProgramVar key) {
    if (mConstructionFinished) {
        throw new java.lang.IllegalStateException("Construction finished, TransFormula must not be modified.");
    }else {
        return mOutVars.remove(key);
    }
}