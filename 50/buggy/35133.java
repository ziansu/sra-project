@java.lang.Override
public void setListening(boolean listening) {
    if ((mListening) == listening)
        return ;
    
    mListening = listening;
    if (listening) {
        mObserver.startObserving();
    }else {
        mObserver.endObserving();
    }
}