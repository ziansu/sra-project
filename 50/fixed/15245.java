public de.uni_freiburg.informatik.ultimate.logic.Term addAuxVar(final de.uni_freiburg.informatik.ultimate.logic.TermVariable arg0, final de.uni_freiburg.informatik.ultimate.logic.Term arg1) {
    if (mConstructionFinished) {
        throw new java.lang.IllegalStateException("Construction finished, TransFormula must not be modified.");
    }else {
        return mAuxVars.put(arg0, arg1);
    }
}