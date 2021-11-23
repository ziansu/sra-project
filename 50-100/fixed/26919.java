@android.annotation.SuppressLint(value = "UseSparseArrays")
public java.util.HashMap<java.lang.Integer, iit.android.swarachakra.KeyAttr> handleException(int keyCode) {
    java.util.HashMap<java.lang.Integer, iit.android.swarachakra.KeyAttr> sKeys = new java.util.HashMap<java.lang.Integer, iit.android.swarachakra.KeyAttr>();
    switch (keyCode) {
        case iit.android.language.MainLanguageExceptionHandler.TRAKARCODE :
            handleTrakar(sKeys);
            break;
        case iit.android.language.MainLanguageExceptionHandler.NUKTACODE :
            handleNukta(sKeys);
            break;
        case iit.android.language.MainLanguageExceptionHandler.RAFARCODE :
            handleRafar(sKeys);
            break;
    }
    initializeKeyArray();
    return sKeys;
}