public void restore() {
    ExecutingLineIndex = mELI;
    LineIndex = mLI;
    PossibleKeyWord = mPKW;
    VarSearchStart = mVSS;
    mSVN = VarNames.size();
    mVI = VarIndex.size();
    mNVV = com.rfo.basic.Run.NumericVarValues.size();
    mSVV = StringVarValues.size();
    mAT = ArrayTable.size();
    trimArray(VarNames, mSVN);
    trimArray(VarIndex, mVI);
    trimArray(com.rfo.basic.Run.NumericVarValues, mNVV);
    trimArray(StringVarValues, mSVV);
    trimArray(ArrayTable, mAT);
}