public boolean addBranchEncoders(final java.util.Collection<? extends de.uni_freiburg.informatik.ultimate.logic.TermVariable> arg0) {
    if (mConstructionFinished) {
        throw new java.lang.IllegalStateException("Construction finished, TransFormula must not be modified.");
    }else {
        return mBranchEncoders.addAll(arg0);
    }
}