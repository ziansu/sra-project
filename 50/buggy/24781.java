public de.uni_freiburg.informatik.ultimate.logic.Term removeAuxVar(final de.uni_freiburg.informatik.ultimate.logic.TermVariable arg0) {
    if (mConstructionFinished) {
        return mAuxVars.remove(arg0);
    }else {
        throw new java.lang.IllegalStateException("Construction finished, TransFormula must not be modified.");
    }
}