public void restore() {
    ExecutingLineIndex = mELI;
    LineIndex = mLI;
    PossibleKeyWord = mPKW;
    VarSearchStart = mVSS;
    trimArray(VarNames, mSVN);
    trimArray(VarIndex, mVI);
    trimArray(com.rfo.basic.Run.NumericVarValues, mNVV);
    trimArray(StringVarValues, mSVV);
    trimArray(ArrayTable, mAT);
}