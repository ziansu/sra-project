@java.lang.Override
public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    if ((mLanguage1Words.size()) > (position)) {
        mLanguage1Words.remove(position);
    }
    mLanguage1Words.add(position, charSequence.toString());
    while ((mLanguage1Words.size()) > (mLanguage2Words.size())) {
        mLanguage2Words.add(null);
    } 
}