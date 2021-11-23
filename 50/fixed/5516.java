public boolean addBranchEncoder(final de.uni_freiburg.informatik.ultimate.logic.TermVariable arg0) {
    if (mConstructionFinished) {
        throw new java.lang.IllegalStateException("Construction finished, TransFormula must not be modified.");
    }else {
        return mBranchEncoders.add(arg0);
    }
}