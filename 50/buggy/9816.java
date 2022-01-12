@java.lang.Override
public void addTextChangedListener(android.text.TextWatcher watcher) {
    if ((mListeners) == null) {
        mListeners = new com.facebook.react.views.textinput.ArrayList();
        super.addTextChangedListener(getTextWatcherDelegator());
    }
    mListeners.add(watcher);
}