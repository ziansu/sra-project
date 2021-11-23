public boolean addBranchEncoder(final de.uni_freiburg.informatik.ultimate.logic.TermVariable arg0) {
    if (mConstructionFinished) {
        return mBranchEncoders.add(arg0);
    }else {
        throw new java.lang.IllegalStateException("Construction finished, TransFormula must not be modified.");
    }
}