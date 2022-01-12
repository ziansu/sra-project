public void resetKeyChars() {
    java.lang.String newString;
    for (android.inputmethodservice.Keyboard.Key key : mKeys) {
        newString = getKeyString(key.codes[0]);
        if (newString == "NO_VALUE") {
            key.label = "";
        }else
            if (newString != "") {
                key.label = newString;
                key.popupCharacters = newString;
            }
        
    }
    if ((kv) != null) {
        kv.invalidateAllKeys();
    }
}