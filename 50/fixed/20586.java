@java.lang.Override
public void addTextChangedListener(android.text.TextWatcher watcher) {
    if ((watcher.equals(mTextWatcher)) || ((mTextWatchers) == null)) {
        super.addTextChangedListener(watcher);
    }else {
        mTextWatchers.add(watcher);
    }
}