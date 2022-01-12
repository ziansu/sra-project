public void setFormula(final de.uni_freiburg.informatik.ultimate.logic.Term formula) {
    if (mConstructionFinished) {
        throw new java.lang.IllegalStateException("Construction finished, TransFormula must not be modified.");
    }else {
        if ((mFormula) == null) {
            mFormula = formula;
        }else {
            throw new java.lang.IllegalStateException("Formula already set.");
        }
    }
}