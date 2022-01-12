public boolean equals(se.newmarksaur.poeless.compiler.environment.conditions.QualityCondition qc) {
    if (qc == null) {
        return false;
    }else
        if ((mOperator) == null) {
            return ((qc.mOperator) == null) && ((mQuality) != (qc.mQuality));
        }
    
    return (mOperator.equals(qc.mOperator)) && ((mQuality) == (qc.mQuality));
}