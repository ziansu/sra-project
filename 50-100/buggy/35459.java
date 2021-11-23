private void startEvaluate() {
    if ((mIse) == null) {
        alert("mIse is null in 'startEvaluate'");
        return ;
    }
    showTip(standardTxt);
    java.lang.String evaText = standardTxt;
    mLastResult = null;
    setParams();
    mIse.startEvaluating(evaText, null, mEvaluatorListener);
}