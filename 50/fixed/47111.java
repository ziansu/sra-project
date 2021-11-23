@java.lang.Override
public boolean handleGetData(java.lang.String data) {
    if (!(mBeginDetect))
        return true;
    
    if (mFragment.handleGetData(data)) {
        return true;
    }
    resetUI();
    mBeginDetect = false;
    jumpToResult();
    return true;
}